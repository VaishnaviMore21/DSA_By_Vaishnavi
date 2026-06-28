# Add_One_To_Number

## Problem statement
Implement Add_One_To_Number using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Convert list to number (risk overflow), add one, rebuild.

## Better
Reverse list and propagate carry.

## Optimal
Recursive carry propagation also optimal.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
Input like 9->9 requires new leading node.
