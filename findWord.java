package myProject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class findWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			    String[] arr= null;
			    List<String> itemsSchool = new ArrayList<String>();
			    FileInputStream fstream_school = new FileInputStream("C:\\Users\\Hodaya\\Documents\\Book.txt");
		        DataInputStream data_input = new DataInputStream(fstream_school);
		        BufferedReader buffer = new BufferedReader(new InputStreamReader(data_input));
		        String str_line;
		        while ((str_line = buffer.readLine()) != null) 
		        { 
		            //str_line = str_line.trim();
		            if ((str_line.length()!=0))  
		            { 
		            String[] words = str_line.split("\\s+");
		            for (int i = 0; i < words.length; i++) {
		                // You may want to check for a non-word character before blindly
		                // performing a replacement
		                // It may also be necessary to adjust the character class
		                itemsSchool.add(words[i].replaceAll("[^\\w]", ""));
		            }

		                
		            } 
		        }

		        arr = (String[])itemsSchool.toArray(new String[itemsSchool.size()]);
		        
		        
		        System.out.println(findword(itemsSchool,"the"));
		        System.out.println(findword(itemsSchool, "Arthur"));
		    }
		catch (Exception e)  
		    {
		     // Catch exception if any
		        System.err.println("Error: " + e.getMessage());
		    }
	}

	private static int findword(List<String> itemsSchool,String string) {
		HashMap<String,Integer> map=new HashMap<>();
		
		for(int i=0;i<itemsSchool.size();i++)
		{
			if(map.containsKey(itemsSchool.get(i)))
			{
				map.put(itemsSchool.get(i),(map.get(itemsSchool.get(i)))+1);
			}
			else
			{
				map.put(itemsSchool.get(i),1);
			}
		}
		
		if(map.containsKey(string))
		{
			return map.get(string); 
		}
		
		return 0;
		
	}

}
