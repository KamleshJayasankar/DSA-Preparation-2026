# Day 01 - Key Patterns

## Single Traversal

Many basic array operations can be completed by visiting each element once.

Examples:
- Sum
- Maximum
- Minimum
- Counting
- Second-largest tracking

Typical time: `O(n)`

## Read / Write Two Pointers

One pointer reads the input while another writes the required values back into the same array.

Used today in:
- LeetCode #27 Remove Element
- LeetCode #26 Remove Duplicates from Sorted Array

Typical extra space: `O(1)`

## HashMap Complement Lookup

For Two Sum, store previously seen values and check whether the required complement has already appeared.

Time: `O(n)` average
Space: `O(n)`

## Right-to-Left Shifting

For array insertion, move existing elements from the end toward the insertion index before placing the new value.
