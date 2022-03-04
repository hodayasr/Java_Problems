package myProject;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

	/*
	 * Given an integer array nums, 
	 * return true if any value appears at least twice in the array, 
	 * and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
	 */
	
    public static boolean containsDuplicate(int[] nums) {
        HashSet set=new HashSet();
        
        for(int i=0;i<nums.length;i++)
        {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,1};
		System.out.print(Arrays.toString(a)+" - ");
		System.out.println(containsDuplicate(a));
		
		int[] b= {1,2,3,4};
		System.out.print(Arrays.toString(b)+" - ");
		System.out.println(containsDuplicate(b));
		
		int[] c= {1,1,1,3,3,4,3,2,4,2};
		System.out.print(Arrays.toString(c)+" - ");
		System.out.println(containsDuplicate(c));
		
		int[] d= {};
		System.out.print(Arrays.toString(d)+" - ");
		System.out.println(containsDuplicate(d));
		
		int[] e= {1};
		System.out.print(Arrays.toString(e)+" - ");
		System.out.println(containsDuplicate(e));
	}

}
