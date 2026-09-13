# Rotated Search — Trace Example

For `[4, 5, 6, 7, 0, 1, 2]` with target `0`:

1. Find `mid` and compare it with the target.
2. Determine which side is sorted.
3. The left side `[4, 5, 6, 7]` is sorted.
4. Target `0` is not inside that sorted range.
5. Eliminate the left side and continue with the right side.
6. Repeat until the target is found at index `4`.

The trace demonstrates the sorted-half observation used in LeetCode #33.
