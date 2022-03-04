package myProject;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	/**
	 * Given an array of integers nums and an integer target, 
	 * return indices of the two numbers such that they add up to target.
	 * You may assume that each input would have exactly one solution, 
	 * and you may not use the same element twice.
	 * 
	 * You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]


Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
	 */
	
	
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap=new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            int num=target-nums[i];
            
            if(hashmap.containsKey(num)) {
                return new int[] {hashmap.get(num),i};
            }
            
            hashmap.put(nums[i],i);
        }
 throw new IllegalArgumentException("no much found!");   
    }
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,7,11,15};
		int[] ans1=(twoSum(nums,9));
		
		System.out.println("["+ans1[0]+" , "+ans1[1]+"]");

		int []nums2 = {3,2,4};
		int[] ans2=(twoSum(nums2,6));
		System.out.println("["+ans2[0]+" , "+ans2[1]+"]");


		int []nums3 = {3,3};
		int[] ans3=(twoSum(nums3,6));
		System.out.println("["+ans3[0]+" , "+ans3[1]+"]");

	}

}
