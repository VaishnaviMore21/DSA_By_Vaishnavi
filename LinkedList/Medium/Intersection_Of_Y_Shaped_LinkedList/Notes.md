# Intersection_Of_Y_Shaped_LinkedList

## Problem statement
Implement Intersection_Of_Y_Shaped_LinkedList using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Use set to store first list nodes.

## Better
Length-align two pointers.

## Optimal
Pointer switching technique O(1) space.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n+m)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
Intersection is by node reference, not value.
