# Binary Search — Trace Example

For the sorted array `[10, 20, 30, 40, 50, 60]` and target `40`:

1. `left = 0`, `right = 5`, `mid = 2` → value `30`.
2. `30 < 40`, so move to the right half.
3. `left = 3`, `right = 5`, `mid = 4` → value `50`.
4. `50 > 40`, so move to the left half.
5. `left = 3`, `right = 3`, `mid = 3` → value `40`.
6. Target found at index `3`.

The example shows how the search space is reduced after each comparison.
