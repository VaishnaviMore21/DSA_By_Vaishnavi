# Flatten_LinkedList

## Problem statement
Implement Flatten_LinkedList using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Collect all nodes then sort values.

## Better
Merge lists pairwise.

## Optimal
Recursive merge flatten for multi-level list is optimal pattern.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n log n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
Original Striver variant uses bottom pointers; adapt accordingly.
