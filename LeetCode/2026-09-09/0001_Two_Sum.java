/*
 * LeetCode #1 - Two Sum
 *
 * Official problem: https://leetcode.com/problems/two-sum/
 *
 * Approaches learned:
 * 1. Brute force
 * 2. HashMap optimization
 *
 * Brute force:
 * Time: O(n^2)
 * Space: O(1)
 *
 * HashMap optimization:
 * Time: O(n)
 * Space: O(n)
 *
 * Key learning:
 * Use complement lookup with a HashMap to avoid checking every pair.
 */

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[0];
    }
}
