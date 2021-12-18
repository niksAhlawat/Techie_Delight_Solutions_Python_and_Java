'''

Given an unsorted integer array, find a pair with the given sum in it.

• Each input can have multiple solutions. The output should match with either one of them.

Input : nums[] = [8, 7, 2, 5, 3, 1], target = 10
Output: (8, 2) or (7, 3)

• The solution can return pair in any order. If no pair with the given sum exists, the solution should return an empty tuple.

Input : nums[] = [5, 2, 6, 8, 1, 9], target = 12
Output: ()

'''
from typing import List, Tuple

class Solution:
    
    def findPair(self, nums: List[int], target: int) -> Tuple[int]:
		
        for i in range(len(nums)-1):
            for j in range(i+1,len(nums)):
                if target == nums[i]+nums[j]:
                     
                    return (nums[i], nums[j])
                    
        return ()  
        


nums = list(map(int, input().rstrip().split()))
target = int(input().rstrip())
s = Solution()
print(s.findPair(nums, target))
	

