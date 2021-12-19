'''

Given a binary array, in-place sort it in linear time and constant space. The output should contain all zeroes, followed by all ones.

Input : [1, 0, 1, 0, 1, 0, 0, 1]
Output: [0, 0, 0, 0, 1, 1, 1, 1]

Input : [1, 1]
Output: [1, 1]

'''
from typing import List

class Solution:
	def sortArray(self, nums: List[int]) -> None:
		# Write your code here...

        #We can simply use Array.sort() too
        #nums.sort()

		for i in range(len(nums)):
            for j in range(i,len(nums)):
                if(nums[i]>nums[j]):
                    temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
		return nums

nums = [0,1,1,0,0,1,0,1]
print(Solution().sortArray(nums))        



