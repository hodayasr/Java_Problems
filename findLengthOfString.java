package myProject;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class findLengthOfString {

	public static int findlength(String s)
	{
		String o;
		int i=0;
		while(!s.substring(i).isEmpty())
		{
			o=s.substring(i);
			i++;
			//System.out.println(o.substring(i)+" i = "+i);
		}
		return i;
	}

	public static String findString(String s)
	{
		String o ,ans="";
		int i=0;
		while(!s.substring(i).isEmpty())
		{
			o=s.substring(i);
			i++;
			ans=ans+s.charAt(i-1);
			//System.out.println(o.substring(i)+" i = "+i);
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=" find my length";
		//System.out.println(s.length());
		System.out.println(findString(s));
		System.out.println("length: "+findlength(s));

		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				count+=2;
				//System.out.println(count);
			}
		}

		Character[] c=new Character[s.length()+count];

		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(s.charAt(j)==' ')
			{
				c[i]='%';
				c[i+1]='2';
				c[i+2]='0';
				i+=2;
				j++;
			}
			else {
				c[i]=s.charAt(j);
				j++;
			}
		}
		System.out.println(Arrays.toString(c));
		String newString="";
		for(int i=0;i<c.length;i++)
		{
			newString=newString+c[i];
		}

		System.out.println(newString);
		
		
		
	}
	



}


