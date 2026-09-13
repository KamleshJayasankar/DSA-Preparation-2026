# Day 2 — Complexity Examples

## Linear Search

If an array has `n` elements, the target may require checking all `n` elements.

Worst-case time: `O(n)`.

## Binary Search

If the search space is repeatedly halved, the number of useful iterations grows logarithmically.

Worst-case time: `O(log n)`.

## Rotated Search

The rotated-array method still eliminates one half after identifying the sorted side.

Worst-case time: `O(log n)`.

## Space

The implementations use a fixed number of pointer variables rather than additional arrays or maps.

Space: `O(1)`.
