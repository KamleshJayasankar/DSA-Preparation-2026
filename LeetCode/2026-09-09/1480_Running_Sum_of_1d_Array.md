# LeetCode #1480 - Running Sum of 1d Array

**Official problem:** https://leetcode.com/problems/running-sum-of-1d-array/

## Approach

Build the running total during one traversal. Each position accumulates the value from the previous position.

## Complexity

- Time: `O(n)`
- Auxiliary Space: `O(1)` beyond the output array

## Key Learning

A running accumulation can often be computed in a single pass.
