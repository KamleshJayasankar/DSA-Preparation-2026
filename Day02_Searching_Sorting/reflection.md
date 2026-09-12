# Day 2 — Reflection

## Date

10 September 2026

## Topics Covered

- Linear Search
- Binary Search
- Modified Binary Search
- Searching in Rotated Sorted Arrays

## LeetCode Progress

Solved 2 targeted LeetCode problems:

- LeetCode #33 — Search in Rotated Sorted Array
- LeetCode #153 — Find Minimum in Rotated Sorted Array

## What I Learned

I learned how Linear Search checks elements one by one and how Binary Search reduces the search space by half.

I also learned that Binary Search can be modified for problems where the array has a special structure.

For rotated sorted arrays, the important observation is that at least one half of the array is sorted. By identifying the sorted half, I can determine which part of the array should be searched.

For finding the minimum in a rotated sorted array, I learned how comparing `nums[mid]` with `nums[right]` helps determine which side contains the minimum.

## Complexity

- Linear Search: O(n)
- Binary Search: O(log n)
- Rotated Array Search: O(log n)
- Find Minimum in Rotated Array: O(log n)

## Progress

Day 2 completed.

LeetCode target for the day: 7

Actually completed: 2

The remaining problems were not completed and are intentionally not recorded as solved.