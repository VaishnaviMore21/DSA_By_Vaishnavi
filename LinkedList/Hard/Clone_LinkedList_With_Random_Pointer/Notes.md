# Clone_LinkedList_With_Random_Pointer

## Problem statement
Implement Clone_LinkedList_With_Random_Pointer using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Hash map original->clone mapping.

## Better
Two-pass map wiring of next/random.

## Optimal
Interleaving clone nodes for O(1) extra space.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
Need dedicated node with random pointer in full implementation.
