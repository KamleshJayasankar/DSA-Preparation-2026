# LeetCode #189 - Rotate Array

## Problem Pattern

Rotate an array to the right by `k` positions.

## Approach Used

Reversal algorithm:

1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining elements.

Before rotating, use `k % n` so that rotations larger than the array length are reduced.

## Complexity

- Time: O(n)
- Extra Space: O(1)

## Example

Input: `[1,2,3,4,5,6,7]`, `k = 3`

Output: `[5,6,7,1,2,3,4]`

## Key Learning

The important idea is that rotation can be performed in-place by combining three reversals rather than creating another array.
