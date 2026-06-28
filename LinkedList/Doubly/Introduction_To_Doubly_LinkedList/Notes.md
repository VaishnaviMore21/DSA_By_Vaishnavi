# Introduction_To_Doubly_LinkedList

## Problem statement
Implement Introduction_To_Doubly_LinkedList using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Create nodes and wire both prev and next.

## Better
Iterative builder with prev tracking.

## Optimal
Tail-tracked iterative construction is optimal.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for pointer rewiring unless additional data structures are used.

## Interview notes
Always maintain symmetry: a.next.prev == a.
