package myProject;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	/*
	 * Given an integer array nums, 
	 * return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
	 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
	 * 
	 * You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
	 */

    public static int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];

        arr[nums.length-1] = 1; 
            
        for ( int i =nums.length-2 ; i >= 0 ; i--){
            arr[i] = nums[i+1] * arr[i+1]; 
        }
        
        int lp = 1; 
        for ( int i = 0 ;i<nums.length; i++){
            arr[i] = lp * arr[i]; 
            lp = lp * nums[i]; 
        }
        return arr; 
        }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("\nExample 1:  ");
		int[] arr= {1,2,3,4};
				// Output: [24,12,8,6]
		System.out.println(Arrays.toString(arr));
		System.out.println("output:"+Arrays.toString(productExceptSelf(arr)));

		System.out.print("\n\nExample 2:  ");
		int[] arr2= {-1,1,0,-3,3};
				// Output: [0,0,9,0,0]
		System.out.println(Arrays.toString(arr2));		
		System.out.println("output:"+Arrays.toString(productExceptSelf(arr2)));
	}

}
