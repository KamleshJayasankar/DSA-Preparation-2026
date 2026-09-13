# Modified Binary Search

Modified Binary Search keeps the binary-search idea but adds conditions that use the structure of the problem to decide which half can be eliminated.

## Day 2 Pattern

For a rotated sorted array:

1. Calculate `mid`.
2. Check whether `nums[mid]` is the target.
3. Determine which half is sorted.
4. Check whether the target belongs to that sorted half.
5. Keep the possible half and eliminate the other half.

## Complexity

- Time: O(log n)
- Space: O(1)

This pattern was used for LeetCode #33.
