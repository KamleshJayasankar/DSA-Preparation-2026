# Day 04 Pattern Recognition

## Recursion Checklist

Ask:

1. Can the problem be reduced to a smaller version of itself?
2. Does the smaller problem have the same structure?
3. Is there a clear stopping condition?

If yes, recursion may be useful.

## Backtracking Checklist

Ask:

1. Are there multiple choices at each step?
2. Do I need to explore different possibilities?
3. Do I need to reverse a previous choice before trying another?

If yes, think:

**Choose -> Explore -> Undo**

## Important Distinction

- Factorial -> recursion
- Find maximum recursively -> recursion
- Generate subsets -> backtracking
- Generate permutations -> backtracking
- N-Queens -> backtracking

Backtracking normally uses recursion, but recursion by itself does not mean backtracking.
