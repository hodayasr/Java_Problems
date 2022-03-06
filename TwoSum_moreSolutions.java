package myProject;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to target.
 * input would have more one solution, 
 * and you may not use the same element twice.
 **/
public class TwoSum_moreSolutions {

	public static int[][] twoSum(int[] nums, int target) {
		int[][] ans=new int[nums.length][2];
		int c=0;
		Map<Integer,Integer> hashmap=new HashMap<>();

		for(int i=0;i<nums.length;i++) {
			int num=target-nums[i];

			if(hashmap.containsKey(num)) {
				ans[c]=new int[] {hashmap.get(num),i};
				c++;
			}

			hashmap.put(nums[i],i);
		}
		return ans;
		//throw new IllegalArgumentException("no much found!");   
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,7,11,15,8,1,9,0,13,4,5};
		int[][] ans1=(twoSum(nums,9));
		for(int i=0;i<ans1.length;i++) {
			if(ans1[i][0]>0||ans1[i][1]>0)
			{
				System.out.println(Arrays.toString(ans1[i]));
			}
		}

		int []nums2 = {3,2,4};
		int[][] ans2=(twoSum(nums2,6));
		//System.out.println("["+ans2[0]+" , "+ans2[1]+"]");


		int []nums3 = {3,3};
		int[][] ans3=(twoSum(nums3,6));
		//System.out.println("["+ans3[0]+" , "+ans3[1]+"]");

	}


}
