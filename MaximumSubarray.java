package myProject;

public class MaximumSubarray {

	/*
	 * Given an integer array nums, 
	 * find the contiguous subarray (containing at least one number) 
	 * which has the largest sum and return its sum.
	 * 
	 * A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.


Example 2:

Input: nums = [1]
Output: 1


Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
	 */
	
	
    public static int maxSubArray(int[] nums) {
        int maxsum=nums[0],sum=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(sum<0){
                sum=0;
            }
            
            sum+=nums[i];
            if(sum>maxsum)
            {
                maxsum=sum;
            }
            
            
        }
        return maxsum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(a)); // return 6

		int[] b={1};
		System.out.println(maxSubArray(b)); // return 1

		int[] c={5,4,-1,7,8};
		System.out.println(maxSubArray(c)); // return 23

	}

}
