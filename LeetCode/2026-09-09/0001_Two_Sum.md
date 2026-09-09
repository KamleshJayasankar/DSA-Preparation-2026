# LeetCode #1 - Two Sum

**Official problem:** https://leetcode.com/problems/two-sum/

## Approaches

### 1. Brute Force

Check every pair of values until the target sum is found.

- Time: `O(n^2)`
- Space: `O(1)`

### 2. HashMap Optimization

Store previously seen values and look for the required complement.

- Time: `O(n)`
- Space: `O(n)`

## Key Learning

The optimized approach improves the repeated pair search by using constant-time average HashMap lookup.
