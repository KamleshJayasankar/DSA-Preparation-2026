# LeetCode #26 - Remove Duplicates from Sorted Array

**Official problem:** https://leetcode.com/problems/remove-duplicates-from-sorted-array/

## Approach

Use two pointers. The sorted-array property means a value is new when it differs from the previous value.

- `right` scans the array.
- `left` marks the next position for a unique value.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Key Learning

The sorted property allows duplicate detection by comparing adjacent elements while maintaining the result in-place.
