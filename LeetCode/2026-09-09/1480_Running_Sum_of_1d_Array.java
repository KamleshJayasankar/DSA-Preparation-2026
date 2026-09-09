/*
 * LeetCode #1480 - Running Sum of 1d Array
 *
 * Official problem: https://leetcode.com/problems/running-sum-of-1d-array/
 *
 * Approach:
 * Maintain a running total while traversing the array.
 *
 * Time: O(n)
 * Space: O(1) auxiliary space beyond the returned/output array.
 *
 * Key learning:
 * A running accumulation can be built in a single traversal.
 */

public class RunningSumOf1dArray {

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        return nums;
    }
}
