package myProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	
	/**
	 * Given an integer array nums ,
	 * return all the triplets [nums[i], nums[j], nums[k]] 
	 * such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

	 * Notice that the solution set must not contain duplicate triplets.

 

	 * Example 1:

	 * Input: nums = [-1,0,1,2,-1,-4]
	 * Output: [[-1,-1,2],[-1,0,1]]
	 * 
	 * Example 2:

	 * Input: nums = []
	 * Output: []
	 * 
	 * Example 3:

	 * Input: nums = [0]
	 * Output: []
	 */
	
	
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
         Arrays.sort(nums);
         
             for(int i=0; i<nums.length-2; ++i) {
             if(i>0 && nums[i]==nums[i-1]) continue;
                 int l=i+1;
                 int r=nums.length-1;
                 
                 while(l<r)
                 {
                     int threesum=nums[i]+nums[l]+nums[r];
                     if(threesum>0)
                     {
                         r--;
                     }else if(threesum<0)
                     {
                         l++;
                     }else {
                         res.add(Arrays.asList(new Integer[]{nums[i], nums[l], nums[r]}));
                         l++;
                         while(nums[l]==nums[l-1]&&l<r){
                             l++;
                         }
                     }
                 }
             }
         
         return new ArrayList<>(res);
     }
    
    public static void main(String[] args) {
    	int[] arr= {-1,0,1,2,-1,-4};
		System.out.println(threeSum(arr));
	}

}
