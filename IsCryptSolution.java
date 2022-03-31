package myProject;

import java.util.HashMap;

public class IsCryptSolution {
	
	// CODESIGNAL - IsCryptSolution
	static boolean solution(String[] crypt, char[][] solution) {
	    HashMap<Character,Character> map=new HashMap<>();
	    
	    for(int i=0;i<solution.length;i++)
	    {
	        map.put(solution[i][0],solution[i][1]);
	    }

	String[] seq=new String[3];
	for(int i=0;i<crypt.length;i++)
	{
	    String n="";
	    for(char c:crypt[i].toCharArray())
	    {
	        n=n+map.get(c);
	    }
	    seq[i]=n;
	}
	
	System.out.print(seq[0]+" + "+seq[1]+" = "+seq[2]+" ? ");
	if(seq[0].length()>1&&seq[1].length()>1&&
	    (seq[0].charAt(0)=='0'||seq[1].charAt(0)=='0'||seq[2].charAt(0)=='0')) return false;
	Long n1=(Long.parseLong(seq[0]));
	Long n2=(Long.parseLong(seq[1]));
	Long ans=(Long.parseLong(seq[2]));
	

	if(n1+n2==ans) return true;
	return false;

	}


	//SOL2 : 
	/*
	boolean solution(String[] crypt, char[][] solution) {
	for(char[] arr : solution){
	        for(int i = 0; i < crypt.length; i++){
	            crypt[i]=crypt[i].replace(arr[0],arr[1]);
	        }
	        System.out.println(Arrays.toString(crypt));
	    }
	    
	    for(int i = 0; i < crypt.length; i++){
	        if(!crypt[i].equals("0")&&crypt[i].startsWith("0"))
	            return false;
	    }
	int n1=(Integer.valueOf(crypt[0]));
	int n2=(Integer.valueOf(crypt[1]));
	int ans=(Integer.valueOf(crypt[2]));
	if(n1+n2==ans) return true;
	return false;

	}

	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] crypt={"TEN","TWO","ONE"};
		char[][] sol= {{'O','1'},
						{'T','0'},
						{'W','9'},
						{'E','5'},
						{'N','4'}};
		
		System.out.println(solution(crypt, sol));
		
		String[] crypt2={"AAAAAAAAAAAAAA","BBBBBBBBBBBBBB","CCCCCCCCCCCCCC"};
		char[][] sol2= {{'A','1'},
						{'B','2'},
						{'C','3'}};
		
		System.out.println(solution(crypt2, sol2));
		
		
		}
		
	}

