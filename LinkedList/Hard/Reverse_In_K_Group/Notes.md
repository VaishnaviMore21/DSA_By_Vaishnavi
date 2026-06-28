# Reverse_In_K_Group

## Problem statement
Implement Reverse_In_K_Group using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Use array/list to reverse chunks then rebuild.

## Better
Iterative chunk reversal with extra checks.

## Optimal
In-place k-group reversal with O(1) extra space.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
Leave final chunk unchanged if size < k.
