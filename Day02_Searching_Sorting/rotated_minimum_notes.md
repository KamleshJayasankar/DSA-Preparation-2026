# Finding the Minimum in a Rotated Array

For the rotated-array minimum problem, compare the middle value with the right boundary.

## Decision Rule

- If `nums[mid] > nums[right]`, the minimum must be to the right of `mid`.
- Otherwise, the minimum is at `mid` or to its left.

Therefore:

```text
nums[mid] > nums[right]  →  left = mid + 1
otherwise                 →  right = mid
```

The search continues until `left == right`, where the remaining position contains the minimum.

This pattern was used for LeetCode #153.
