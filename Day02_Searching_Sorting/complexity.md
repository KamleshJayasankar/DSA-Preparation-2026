# Day 2 — Searching Complexity

| Algorithm | Best Case | Average Case | Worst Case | Space |
|---|---|---|---|---|
| Linear Search | O(1) | O(n) | O(n) | O(1) |
| Binary Search | O(1) | O(log n) | O(log n) | O(1) |
| Modified Binary Search | O(1) | O(log n) | O(log n) | O(1) |
| Rotated Array Search | O(1) | O(log n) | O(log n) | O(1) |
| Find Minimum in Rotated Array | O(1) | O(log n) | O(log n) | O(1) |

## Key Difference

### Linear Search

Checks elements one by one, so the number of comparisons can grow with the size of the array.

**Time:** O(n)

### Binary Search

Eliminates approximately half of the search space after each comparison.

**Time:** O(log n)

### Modified Binary Search

Uses the binary-search idea with additional conditions to determine which part of the search space can be eliminated.

**Time:** O(log n)

### Rotated Sorted Array

Identifies the sorted half and eliminates the impossible half.

**Time:** O(log n)

### Space

All the implementations practiced on Day 2 use a constant number of variables and do not create additional data structures.

**Space:** O(1)