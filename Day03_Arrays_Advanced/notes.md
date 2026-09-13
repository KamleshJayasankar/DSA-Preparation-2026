# Day 03 - Arrays Advanced

**Date:** 11 September 2026

## Topics Learned

### 1. Array Rotation
- Right rotation of an array
- Using `k % n` when the number of rotations is larger than the array length
- In-place array reversal
- Two-pointer technique for reversing an array
- Reversal algorithm for rotating an array

### 2. Subarray Basics
- A subarray contains contiguous elements of an array.
- Subarrays must preserve continuity; selecting non-contiguous elements does not form a subarray.
- For an array of size `n`, the total number of possible subarrays is:

`n * (n + 1) / 2`

For `[1, 2, 3]`, there are 6 subarrays.

### 3. Prefix Sum
- Prefix sum stores cumulative sums while traversing an array.
- Prefix sums can answer range-sum queries efficiently.
- For `L > 0`:

`sum(L, R) = prefix[R] - prefix[L - 1]`

- Prefix Sum + HashMap is a useful pattern for subarray-sum problems.
- For a target sum `K`:

`Current Prefix Sum - Previous Prefix Sum = K`

Therefore:

`Previous Prefix Sum = Current Prefix Sum - K`

This is the core idea behind LeetCode #560, which was studied as a concept but was **not counted as solved** on Day 03.

## LeetCode Completed

- #189 Rotate Array

**Day 03 progress: 1/7**

Only the problem actually completed is recorded as solved.