# Day 04 - Complexity Notes

## Recursion

For the simple `print(n)` example:

- Time: O(n)
- Call-stack space: O(n)

For recursive factorial:

- Time: O(n)
- Call-stack space: O(n)

## Backtracking Subsets

For an array of `n` elements, each element has two choices: include or exclude.

This creates up to:

`2^n`

subsets.

The recursion depth is O(n).

The exact total running time for generating and printing subsets also depends on the amount of output produced.
