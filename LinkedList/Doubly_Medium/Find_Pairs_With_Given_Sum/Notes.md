# Find_Pairs_With_Given_Sum

## Problem statement
Implement Find_Pairs_With_Given_Sum using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Check all pairs using nested loops.

## Better
Hash set based 2-sum style scan.

## Optimal
Two-pointer on sorted DLL is optimal.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for pointer rewiring unless additional data structures are used.

## Interview notes
Assumes DLL sorted for two-pointer approach.
