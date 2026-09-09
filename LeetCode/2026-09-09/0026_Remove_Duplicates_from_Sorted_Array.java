/*
 * LeetCode #26 - Remove Duplicates from Sorted Array
 *
 * Official problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * Approach:
 * Two pointers using the sorted-array property.
 *
 * Time: O(n)
 * Space: O(1)
 *
 * Key learning:
 * Use one pointer to read the array and another to write the next unique value.
 */

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int left = 1;

        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[right - 1]) {
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }
}
