'''

Given an integer array, check if it contains a contiguous subarray having zero-sum.

Input : [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]
Output: True
Explanation: The subarrays with zero-sum are

[3, 4, -7]
[4, -7, 3]
[-7, 3, 1, 3]
[3, 1, -4]
[3, 1, 3, 1, -4, -2, -2]
[3, 4, -7, 3, 1, 3, 1, -4, -2, -2]

Input : [4, -7, 1, 2, -1]
Output: False
Explanation: The subarray with zero-sum doesn't exist.

'''
from typing import List

class Solution:
	def hasZeroSumSubarray(self, nums: List[int]) -> bool:
		# create an empty set to store the sum of elements of each
		# sublist `nums[0…i]`, where `0 <= i < len(nums)`
		
		sub = set()
		
		# insert 0 into the set to handle the case when sublist with
		# zero-sum starts from index 0
		
		sub.add(0)
		total = 0
		
		for i in nums:
			# sum of elements so far
			total += i
			
			# if the sum is seen before, we have found a sublist with zero-sum
			if total in sub:
				return True
			
			# insert sum so far into the set
			sub.add(total)
		return False
		
		
		
nums = [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]

s = Solution()
s.hasZeroSumSubarray(nums)

