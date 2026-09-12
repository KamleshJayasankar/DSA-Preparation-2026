# Day 2 — Key Searching Patterns

## 1. Linear Search

- Check elements one by one.
- Works on sorted and unsorted arrays.
- Stop when the target is found.
- Time: O(n)
- Space: O(1)

---

## 2. Binary Search

- Requires a sorted array.
- Maintain `left`, `right`, and `mid`.
- Eliminate half of the search space after each comparison.
- Use:

`mid = left + (right - left) / 2`

- Time: O(log n)
- Space: O(1)

---

## 3. Modified Binary Search

Modified Binary Search uses additional conditions to decide which part of the search space can be eliminated.

The main idea is still:

> Reduce the search space by half whenever possible.

---

## 4. Rotated Sorted Array

For a rotated sorted array:

`[4, 5, 6, 7, 0, 1, 2]`

at least one half of the array is sorted.

### Pattern

1. Find `mid`.
2. Check if `nums[mid]` is the target.
3. Determine which half is sorted.
4. Check whether the target lies inside the sorted half.
5. Search the appropriate half.
6. Continue until the target is found or the search space is empty.

### Complexity

- Time: O(log n)
- Space: O(1)

---

## 5. Finding Minimum in a Rotated Array

For finding the minimum:

- Compare `nums[mid]` with `nums[right]`.
- If `nums[mid] > nums[right]`, the minimum is to the right of `mid`.
- Otherwise, the minimum is at `mid` or to its left.

### Pattern

```text
if nums[mid] > nums[right]
    left = mid + 1
else
    right = mid