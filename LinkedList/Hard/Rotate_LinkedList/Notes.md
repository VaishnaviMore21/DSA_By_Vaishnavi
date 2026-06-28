# Rotate_LinkedList

## Problem statement
Implement Rotate_LinkedList using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Rotate one step k times.

## Better
Use deque/array simulation.

## Optimal
Make circular then cut at new tail.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
Normalize k with k % len.
