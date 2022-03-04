package myProject;

import java.util.Arrays;

public class MaximumProductSubarray {

	/*
	 * Given an integer array nums, find a contiguous non-empty subarray 
	 * within the array that has the largest product, and return the product.
	 * The test cases are generated so that the answer will fit in a 32-bit integer.
	 * 
	 * A subarray is a contiguous subsequence of the array.



Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.


Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
	 */

	public static int maxProduct(int[] nums) {
		int m = nums[0], rM = nums[nums.length - 1];
		int l = m, r = rM;

		for (int i = 1; i < nums.length; i++) {
			l = (l == 0 ? 1: l) * nums[i];
			m = Math.max(l, m);

			r = (r == 0 ? 1: r) * nums[(nums.length - i - 1)];
			rM = Math.max(r, rM);
		}

		return Math.max(m, rM);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,-2,4};
		//Output: 6
		System.out.print(Arrays.toString(a)+" - Maximum Product Subarray: ");
		System.out.println(maxProduct(a));

		int[] b= {-2,0,-1};
		//Output: 0
		System.out.print(Arrays.toString(b)+" - Maximum Product Subarray: ");
		System.out.println(maxProduct(b));


	}

}
