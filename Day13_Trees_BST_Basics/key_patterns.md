# Day 13 - Key Patterns

## Tree Pattern
Think in terms of root, left subtree, right subtree, and the base case where the node is null.

## BST Pattern
At every node:
1. Compare the target/value with the current node.
2. If equal, the value is found.
3. If smaller, move to the left subtree.
4. If greater, move to the right subtree.

## Important Observation
An inorder traversal of a valid BST visits values in sorted order.
