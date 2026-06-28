# Segregate_Odd_And_Even_Nodes

## Problem statement
Implement Segregate_Odd_And_Even_Nodes using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Create two lists for odd/even positions.

## Better
Two dummy lists then join.

## Optimal
In-place odd-even pointer rewiring.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
This is position-based odd/even, not value-based.
