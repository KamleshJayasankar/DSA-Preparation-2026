# Rotated Minimum — Trace Example

For `[4, 5, 1, 2, 3]`:

1. Start with the full search range.
2. Calculate `mid`.
3. Compare `nums[mid]` with `nums[right]`.
4. If the middle value is greater, move `left` past `mid`.
5. Otherwise keep `mid` as a possible minimum and move `right` to `mid`.
6. Stop when `left == right`.

The remaining index contains the minimum value `1`.
