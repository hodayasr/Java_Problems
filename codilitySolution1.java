package myProject;

//you can also use imports, for example:
//import java.util.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



class codilitySolution1 {
 public static int solution(int[] A) {
     // write your code in Java SE 8
     int max=A[0],min=A[0];
     Arrays.sort(A);
     
     Set<Integer> hashmap=new HashSet<>();
     
     //find max and min
     for(int i=0;i<A.length;i++)
     {
         if(A[i]>max) max=A[i];
         if(A[i]<min) min=A[i];
     }
     

     //System.out.println(max);
    // if(min<=0) return 1;
     for(int i=0;i<A.length;i++)
     {
    	 if(A[i]>0)
    	 {
    	 hashmap.add(A[i]);
    	 }
     }
   if(min<=0) min=1;
   if(max<=0) max=1;
     for(int i=min;i<=max;i++)
     {
    	 if(!hashmap.contains(i)) return i;
     }
     return max+1;
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Smallest positive number missing from array :5
		int [] nums= {1, 3, 6, 4, 1, 2};
		System.out.println(solution(nums));
		
		//Smallest positive number missing from array :1
		int [] n= {-1,-3};
		System.out.println(solution(n));
		
		//Smallest positive number missing from array :3
		int [] nums2= {1, 6, 4, 1, 2};
		System.out.println(solution(nums2));
		
		//Smallest positive number missing from array :2
		int [] nums3= {1, 6, 4, 1, -2};
		System.out.println(solution(nums3));
		
		//Smallest positive number missing from array :2
		int [] nums4= {1};
		System.out.println(solution(nums4));
		
		//Smallest positive number missing from array :1
		int [] nums5= {-1};
		System.out.println(solution(nums5));
		
}
}