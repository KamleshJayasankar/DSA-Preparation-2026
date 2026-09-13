# Binary Search — Focus Notes

## Core Idea

Binary Search works on a sorted array and repeatedly eliminates half of the remaining search space.

## Main Variables

- `left`
- `right`
- `mid`

## Mid Calculation

`mid = left + (right - left) / 2`

## Decision Process

1. Calculate `mid`.
2. Compare `nums[mid]` with the target.
3. If equal, return the index.
4. If the middle value is smaller, search the right half.
5. Otherwise, search the left half.

## Complexity

- Best case: O(1)
- Worst case: O(log n)
- Space: O(1)

## Key Learning

The main advantage comes from eliminating half of the remaining search space after each useful comparison.
