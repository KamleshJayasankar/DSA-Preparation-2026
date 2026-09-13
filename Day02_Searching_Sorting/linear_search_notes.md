# Linear Search — Focus Notes

## Core Idea

Linear Search checks elements from left to right until the target is found or the array ends.

## Steps

1. Start at index `0`.
2. Compare `nums[i]` with the target.
3. Return `i` when the target is found.
4. Continue otherwise.
5. Return `-1` if no element matches.

## When to Use

- The array may be unsorted.
- The input size is small or a simple scan is sufficient.
- A sequential search is acceptable.

## Complexity

- Best case: O(1)
- Worst case: O(n)
- Space: O(1)

## Example

For `[10, 25, 30, 45, 50]` and target `45`:

`10 → 25 → 30 → 45`

The target is found at index `3`.
