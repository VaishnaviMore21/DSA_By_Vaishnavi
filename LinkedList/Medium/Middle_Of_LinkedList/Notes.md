# Middle_Of_LinkedList

## Problem statement
Implement Middle_Of_LinkedList using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Compute length then move len/2 steps.

## Better
Two-pointer slow/fast traversal.

## Optimal
Two-pointer is optimal O(n) O(1).

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
For even length, clarify which middle is required.
