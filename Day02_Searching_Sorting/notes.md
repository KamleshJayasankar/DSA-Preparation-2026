# Day 2 — Searching Algorithms

## Topics Learned

- Linear Search
- Binary Search
- Modified Binary Search
- Searching in Rotated Sorted Arrays

---

## 1. Linear Search

Linear Search checks each element one by one until the target is found.

### Basic idea

1. Start from the first element.
2. Compare the current element with the target.
3. If they are equal, return the index.
4. Otherwise, continue to the next element.
5. If the entire array is checked, the target is not present.

### Complexity

- Time: O(n)
- Space: O(1)

---

## 2. Binary Search

Binary Search works on a sorted array.

It uses three variables:

- `left`
- `right`
- `mid`

The middle element is checked and half of the search space is eliminated after each comparison.

### Mid calculation

`int mid = left + (right - left) / 2;`

### Complexity

- Time: O(log n)
- Space: O(1)

---

## 3. Modified Binary Search

Modified Binary Search changes the normal binary search logic depending on the structure of the problem.

Instead of directly comparing only with the target, additional conditions are used to identify which part of the array can be eliminated.

---

## 4. Searching in a Rotated Sorted Array

A rotated sorted array was originally sorted but then rotated.

Example:

`[0, 1, 2, 4, 5, 6, 7]`

can become:

`[4, 5, 6, 7, 0, 1, 2]`

The important observation is:

> At least one half of the array is always sorted.

### Basic approach

1. Find `mid`.
2. Check whether the middle element is the target.
3. Identify which half is sorted.
4. Check whether the target belongs to the sorted half.
5. If it does, search that half.
6. Otherwise, search the other half.
7. Continue until the target is found or the search space becomes empty.

This allows binary-search-style elimination even though the complete array is not normally sorted.

### Complexity

- Time: O(log n)
- Space: O(1)

---

## Key Takeaway

Binary Search does not always require the entire problem space to look traditionally sorted.

For a rotated sorted array, identifying the sorted half allows us to eliminate the impossible half and continue searching efficiently.
