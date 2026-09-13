# Rotated Sorted Array — Observation

A sorted array can be rotated while preserving an important property: at least one side around the middle remains sorted.

Example:

`[4, 5, 6, 7, 0, 1, 2]`

At each step, identify the sorted half and use its boundaries to decide whether the target can lie there.

This observation is the key to applying binary-search-style elimination to LeetCode #33.
