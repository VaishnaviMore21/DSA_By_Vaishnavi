# Delete_Middle_Node

## Problem statement
Implement Delete_Middle_Node using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Find length and delete middle index.

## Better
Slow/fast with prev pointer.

## Optimal
Single traversal with two pointers.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
For two nodes, delete second as middle by convention.
