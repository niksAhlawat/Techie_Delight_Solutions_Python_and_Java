from typing import List, Tuple, Set

class Solution:
    
    def getAllZeroSumSubarrays(self, nums: List[int]) -> Set[Tuple[int]]:
        subarrays = set()
		# Write your code here...
        
        for i in range(len(nums)):
            total = 0
            for j in range(i, len(nums)):
                
                total += nums[j] 
                if total == 0:
                    numbers = tuple(nums[i: j+1])
                    subarrays.add(numbers)
                    
        return subarrays


# Test Case 1 - [4, 2, -3, -1, 0, 4]
# Test Case 2 - [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]
nums = [3, 4, -7, 3, 1, 3, 1, -4, -2, -2]
s = Solution()
print(s.getAllZeroSumSubarrays(nums))

