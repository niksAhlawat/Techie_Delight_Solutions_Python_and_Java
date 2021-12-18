/** 

Given an unsorted integer array, find a pair with the given sum in it.

• Each input can have multiple solutions. The output should match with either one of them.

Input : nums[] = [8, 7, 2, 5, 3, 1], target = 10
Output: (8, 2) or (7, 3)

• The solution can return pair in any order. If no pair with the given sum exists, the solution should return an empty tuple.

Input : nums[] = [5, 2, 6, 8, 1, 9], target = 12
Output: ()

*/




package Practice.Find_Pairs;

import java.util.HashMap;
import java.util.Map;
 
class Find_Pairs
{
    // Function to find a pair in an array with a given sum using hashing
    public static void findPair(int[] nums, int target)
    {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();
 
        // do for each element
        for (int i = 0; i < nums.length; i++)
        {
            // check if pair (nums[i], target-nums[i]) exists
 
            // if the difference is seen before, print the pair
            if (map.containsKey(target - nums[i]))
            {
                System.out.printf("Pair found (%d, %d)", nums[map.get(target - nums[i])], nums[i]);
                return;
            }
 
            // store index of the current element in the map
            map.put(nums[i], i);
        }
 
        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }
 
    public static void main (String[] args)
    {
        int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 8;
 
        findPair(nums, target);
    }
}
