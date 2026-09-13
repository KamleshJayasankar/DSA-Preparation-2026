# Day 03 - Key Patterns

## Array Rotation

For right rotation by `k` positions:

1. Reduce unnecessary rotations with `k = k % n`.
2. Reverse the complete array.
3. Reverse the first `k` elements.
4. Reverse the remaining elements.

This gives an in-place rotation with O(n) time and O(1) extra space.

## Subarray

A subarray is a contiguous portion of an array.

For an array of length `n`:

`number of subarrays = n * (n + 1) / 2`

## Prefix Sum

Prefix sums convert repeated range-sum calculations into constant-time range queries after O(n) preprocessing.

For a range `[L, R]`:

- If `L == 0`, use `prefix[R]`.
- Otherwise, use `prefix[R] - prefix[L - 1]`.

## Prefix Sum + HashMap

For a target subarray sum `K`, the key relationship is:

`previousPrefix = currentPrefix - K`

This pattern is the foundation for problems such as LeetCode #560.
