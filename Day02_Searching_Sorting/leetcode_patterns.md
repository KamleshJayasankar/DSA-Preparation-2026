# Day 2 — LeetCode Patterns

## #33 — Search in Rotated Sorted Array

Pattern: Modified Binary Search.

Key observation: at least one half is sorted. Use the sorted half's boundaries to decide whether the target belongs there.

Complexity: `O(log n)` time and `O(1)` space.

## #153 — Find Minimum in Rotated Sorted Array

Pattern: Binary Search on the rotated structure.

Key observation: compare `nums[mid]` with `nums[right]` to determine where the minimum can remain.

Complexity: `O(log n)` time and `O(1)` space.
