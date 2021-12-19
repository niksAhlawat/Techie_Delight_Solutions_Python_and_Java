package practice.maximum_product_pair;

import java.util.Arrays;
import practice.Pair;

/*

Given an integer array, find a pair with the maximum product in it.

Each input can have multiple solutions. The output should match with either one of them.

Input : [-10, -3, 5, 6, -2]
Output: (-10, -3) or (-3, -10) or (5, 6) or (6, 5)

Input : [-4, 3, 2, 7, -5]
Output: (3, 7) or (7, 3)

If no pair exists, the solution should return null.

Input : [1]
Output: null

*/

class Solution
{
    	/* The Pair<U, V> class have
		1. Two member variables, first and second.
		2. Factory method `Pair.of(U, V)` for creating its immutable instance.
		3. equals() and hashCode() methods overridden.
	*/

    public static Pair<Integer, Integer> findPair(int[] nums)
	{
		// Write your code here...
		// `n` is the length of the array
        int n = nums.length;
 
        // base case
        if (n < 2) {
            return null;
        }
 
        // sort array in ascending order
        Arrays.sort(nums);
 
        // choose the maximum of the following:
        // 1. Product of the first two elements or
        // 2. Product of the last two elements.
 
        if ((nums[0] * nums[1]) > (nums[n - 1] * nums[n - 2])) {
           
           return Pair.of(nums[0], nums[1]);
            
        }
        else {
           return Pair.of(nums[n-1], nums[n-2]);
        }
				
	}
 
    public static void main (String[] args)
    {
        int[] nums = { -10, -3, 5, 6, -20 };
        Pair<Integer, Integer> p =  findPair(nums);
        System.out.println(p);
        
    }
}