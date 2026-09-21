# Sliding Window Notes

A sliding window keeps a range of elements and moves its boundaries instead of recomputing the whole range each time.

For a fixed-size window:
1. Build the first window.
2. Move the right boundary.
3. Add the new element.
4. Remove the element leaving the window.
5. Update the result.
