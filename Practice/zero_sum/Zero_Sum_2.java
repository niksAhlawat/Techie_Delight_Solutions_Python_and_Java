package practice.zero_sum;

import java.util.*;

/*

Given an integer array, find all contiguous subarrays with zero-sum.

Input : [4, 2, -3, -1, 0, 4]
Output: {[-3, -1, 0, 4], [0]}

Input : [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]
Output: {[3, 4, -7], [4, -7, 3], [-7, 3, 1, 3], [3, 1, -4], [3, 1, 3, 1, -4, -2, -2], [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]}

Input : [0, 0]
Output: {[0], [0, 0]}

Input : [1, 2, 3]
Output: {}

Note: Since an input can have multiple subarrays with zero-sum, the solution should return a set containing all the distinct subarrays.

*/

class Solution
{
	public static Set<List<Integer>> getAllZeroSumSubarrays(List<Integer> nums)
	{
		Set<List<Integer>> subarrays = new HashSet<>();
		List<Integer> numbers = new ArrayList<>();
		
		// Write your code here...
		for (int i = 0; i < nums.size()+1; i++)
        {
            
            int sum = 0;
 
            // consider all subarrays ending at `j`
            for (int j = i; j < nums.size(); j++)
            {
                // sum of elements so far
                sum += nums.get(j);
 
                // if the sum is seen before, we have found a subarray with zero-sum
                if (sum == 0) {
                    numbers = nums.subList(i, j+1);
                   // numbers.forEach(System.out::println);
                    //System.out.println("***************");
                    //System.out.println("Subarray [" + i + "---" + j + "]");
                    //System.out.println("***************");
                    subarrays.add(numbers);
                }    
            }       
        }
		return subarrays;
	}

    public static void main (String[] args)
    {
        // 4, 2, -3, -1, 0, 4
        //3, 4, -7, 3, 1, 3, 1, -4, -2, -2
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 4, -7, 3, 1, 3, 1, -4, -2, -2));
        Set<List<Integer>> subarrays = getAllZeroSumSubarrays(nums);

        subarrays.forEach(System.out::println);
  
    }
}

