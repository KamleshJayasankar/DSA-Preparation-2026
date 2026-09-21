# Day 04 - Recursion & Backtracking Basics

**Date:** 12 September 2026  
**Type:** Test Day

## Topics Learned

- What recursion is
- Base case and recursive case
- Call stack and stack unwinding
- Recursion tracing
- Work before vs. after the recursive call
- Factorial using recursion
- Recursion vs iteration
- What backtracking means
- Choose -> Explore -> Undo
- How to recognize backtracking problems

## Core Ideas

### Recursion
Recursion means a function calls itself to solve a smaller version of the same problem.

Every recursion problem should make us identify:

1. **Base case** - the stopping condition.
2. **Recursive case** - the call that moves toward the base case.

### Call Stack
Each recursive call waits for the next call to finish. The call stack stores these unfinished function calls. When the base case is reached, the stack starts unwinding.

### Tracing
If work happens before the recursive call, it happens while going down.

If work happens after the recursive call, it happens while coming back up.

### Backtracking
Backtracking explores different choices using the pattern:

**Choose -> Explore -> Undo -> Try another choice**

Backtracking commonly uses recursion, but not every recursive problem is a backtracking problem.

## Recognition

Think about recursion when a problem can be expressed as a smaller version of itself.

Think about backtracking when a problem asks to:

- generate all possible combinations
- generate subsets
- generate permutations
- try different choices
- explore possible arrangements
- make a choice, explore it, undo it, and try another choice
