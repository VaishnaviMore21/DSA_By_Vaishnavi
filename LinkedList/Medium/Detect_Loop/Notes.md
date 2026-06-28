# Detect_Loop

## Problem statement
Implement Detect_Loop using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Store visited nodes in set.

## Better
Floyd cycle detection.

## Optimal
Floyd is optimal O(1) space.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
Do not dereference fast.next without null checks.
