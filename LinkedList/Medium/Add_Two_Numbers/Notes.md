# Add_Two_Numbers

## Problem statement
Implement Add_Two_Numbers using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Convert both to numbers then add (overflow risk).

## Better
Digit-by-digit with carry in new list.

## Optimal
Carry simulation is optimal for list representation.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(max(n,m))

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
Handle different lengths and final carry.
