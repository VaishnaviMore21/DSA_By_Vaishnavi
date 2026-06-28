# Reverse_Doubly_LinkedList

## Problem statement
Implement Reverse_Doubly_LinkedList using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Use stack or array and rebuild list.

## Better
Iterative pointer swapping.

## Optimal
In-place pointer swap in one traversal.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for pointer rewiring unless additional data structures are used.

## Interview notes
After reversal, last processed node becomes new head.
