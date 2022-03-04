package myProject;

public class SearchInRotatedSortedArray {
/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * 
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 * 
 * You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:

Input: nums = [1], target = 0
Output: -1
 */
	
	  public static int search(int[] nums, int target) {
	        int i=0;


	        //Check the index up to which index is sorted
	        while (i< nums.length-1 && nums[i]<nums[i+1]) {
	            i++;
	        }

	        int ans = binarySearch(nums, target, 0, i);


	        if (ans == -1) {     //Checking if the previous array doesn't have target element then check remaining array
	            ans = binarySearch(nums,target, i+1, nums.length-1);
	        }

	        return ans;


	    }

	    public static int binarySearch(int[] nums, int target, int l, int r) {
	        int ans = -1;
	        
	        while (l<=r) {
	            int mid = (l+r)/2;

	            if (nums[mid]==target){
	                ans=mid;
	                break;
	            }
	            else if(nums[mid]<target)
	                l=mid+1;
	            else
	                r=mid-1;
	        }

	        return ans;
	    }
	    
	    public static void main(String[] args) {
			int [] arr= {4,5,6,7,0,1,2};
			System.out.println(search(arr, 3));  // return -1
			
			System.out.println(search(arr, 0));  // return 4
		}
}
