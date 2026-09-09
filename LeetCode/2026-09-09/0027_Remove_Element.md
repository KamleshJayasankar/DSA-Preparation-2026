# LeetCode #27 - Remove Element

**Official problem:** https://leetcode.com/problems/remove-element/

## Approach

Use two pointers:

- `right` reads every element.
- `left` writes values that should remain.

When `nums[right]` is not equal to `val`, copy it to `nums[left]` and increment `left`.

## Complexity

- Time: `O(n)`
- Space: `O(1)`

## Key Learning

This is an in-place read/write pattern. The array is modified without creating another array.
