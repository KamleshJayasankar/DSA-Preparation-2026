# Call Stack Trace

## Example

For:

`print(3)`

the calls go down as:

`print(3) -> print(2) -> print(1) -> print(0)`

At `print(0)`, the base case returns.

The stack then unwinds:

`print(0) returns -> print(1) finishes -> print(2) finishes -> print(3) finishes`

## Important Observation

A recursive function does not lose the earlier calls. Each call remains on the call stack while waiting for the deeper call to return.

## Work Position

### Before recursion

`print(n); print(n - 1)`

The output happens while going down.

### After recursion

`print(n - 1); print(n)`

The output happens while coming back up.

This distinction is important for tracing recursive algorithms.
