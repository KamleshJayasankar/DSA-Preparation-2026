# Day 04 - Test Cases

## RecursionBasics

Input:
`3`

Expected first section:
`3 2 1`

Expected second section:
`1 2 3`

This demonstrates the difference between work before and after recursion.

## Factorial

| Input | Expected Output |
|---|---:|
| 0 | 1 |
| 1 | 1 |
| 4 | 24 |
| 5 | 120 |

## SubsetBacktracking

For:
`[1, 2, 3]`

There should be:

`2^3 = 8`

subsets, including the empty subset and the full subset.

The important test is not only the output count, but also that the current choice is removed before another branch is explored.
