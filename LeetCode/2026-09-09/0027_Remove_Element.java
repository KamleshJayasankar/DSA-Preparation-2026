/*
 * LeetCode #27 - Remove Element
 *
 * Official problem: https://leetcode.com/problems/remove-element/
 *
 * Approach:
 * Two-pointer read/write technique.
 *
 * Time: O(n)
 * Space: O(1)
 *
 * Key learning:
 * Read every element and write only values that should remain.
 */

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }
}
