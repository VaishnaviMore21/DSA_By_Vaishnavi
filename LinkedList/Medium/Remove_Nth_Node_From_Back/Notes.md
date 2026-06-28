# Remove_Nth_Node_From_Back

## Problem statement
Implement Remove_Nth_Node_From_Back using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Compute length then delete (len-n+1)th.

## Better
Two pass with count.

## Optimal
One-pass two-pointer with gap n.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
Use dummy to handle head deletion.
