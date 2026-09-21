# Backtracking Pattern

The fundamental backtracking flow is:

**CHOOSE -> EXPLORE -> UNDO -> TRY NEXT CHOICE**

Generic structure:

```text
function backtrack(state):

    if solution:
        record answer
        return

    for each choice:
        choose
        backtrack(new state)
        undo
```

## Why Undo Matters

Suppose the current state is:

`[]`

Choose `1`:

`[1]`

After exploring all possibilities beginning with `1`, remove `1`:

`[]`

Now another choice can be explored without the previous choice interfering.

## Recognition

Backtracking is a strong candidate when a problem asks for all possible:

- combinations
- subsets
- permutations
- arrangements

It is also useful when the problem requires trying choices and reversing them during exploration.
