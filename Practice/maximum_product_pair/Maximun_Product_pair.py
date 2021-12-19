'''

Given an integer array, find a pair with the maximum product in it.

Each input can have multiple solutions. The output should match with either one of them.

Input : [-10, -3, 5, 6, -2]
Output: (-10, -3) or (-3, -10) or (5, 6) or (6, 5)

Input : [-4, 3, 2, 7, -5]
Output: (3, 7) or (7, 3)

If no pair exists, the solution should return an empty tuple.

Input : [1]
Output: ()

'''
from typing import List, Tuple

class Solution:
    def findPair(self, nums: List[int]) -> Tuple[int]:
		# Write your code here...
        max_sum = {}
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                max_sum[nums[i]*nums[j]] = (nums[i], nums[j])
        
        return () if not max_sum else (max_sum[max(max_sum)])
						
				
		
#Test Case 1 - [4, -3, -2, -7, 5]
#Test Case 2 - [1]
nums =  [4, -3, -2, -7, 5]
print (Solution().findPair(nums))