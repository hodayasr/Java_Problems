package myProject;

public class isPalindrome {
	/* LeetCode - 9
	 * 
	 * Given an integer x, return true if x is palindrome integer.
	 * An integer is a palindrome when it reads the same backward as forward.
	 * 
	 * For example, 121 is a palindrome while 123 is not.
 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
	 */

    public static boolean isPalindrome(int x) {
        if(x<0||(x % 10 == 0 && x != 0)) return false;
        
        if(x<10) return true;
        
        int r=0;
        while(x>r)
        {
            r=r*10+x%10;
            x/=10;
        }
        
         return x == r || x == r/10;
    }
    
	public static void main(String[] args) {
		System.out.println(isPalindrome(121)?"121 is Palindrome":"121 isn't Palindrome");
		System.out.println(isPalindrome(-121)?"-121 is Palindrome":"-121 isn't Palindrome");
		System.out.println(isPalindrome(10)?"10 is Palindrome":"10 isn't Palindrome");

	}

}
