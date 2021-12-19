package practice;

/*

Given a binary array, in-place sort it in linear time and constant space. The output should contain all zeroes, followed by all ones.

Input : [1, 0, 1, 0, 1, 0, 0, 1]
Output: [0, 0, 0, 0, 1, 1, 1, 1]

Input : [1, 1]
Output: [1, 1]

*/

class Solution
{
	public static void sortArray(int[] nums)
	{
		// Write your code here...
		//Arrays.sort(nums);
		
		for (int i = 0; i<nums.length; i++) {
			for (int j = i+1; j<nums.length; j++) {
				int tmp = 0;  
				if (nums[i] > nums[j]) {
					tmp = nums[i];  
					nums[i] = nums[j];  
					nums[j] = tmp;  
					
				}  

			}
			System.out.println(nums[i]);
		}
		
	}

    public static void main (String[] args)
    {
        int[] nums = {0, 1, 1, 0, 0, 1, 0, 1};
        Solution.sortArray(nums);
    }
}
