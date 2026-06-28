# Find_Starting_Point_Of_Loop

## Problem statement
Implement Find_Starting_Point_Of_Loop using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Use visited set and return first repeat.

## Better
Floyd + reset pointer to head.

## Optimal
Meeting-point theorem gives optimal method.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
If no loop, return sentinel.
