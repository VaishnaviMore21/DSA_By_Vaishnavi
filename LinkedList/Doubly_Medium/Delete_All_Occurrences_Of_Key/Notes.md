# Delete_All_Occurrences_Of_Key

## Problem statement
Implement Delete_All_Occurrences_Of_Key using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Traverse and relink neighbors when key found.

## Better
Same pointer update with cleaner helper methods.

## Optimal
Single traversal deletion is optimal.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for pointer rewiring unless additional data structures are used.

## Interview notes
Update head when first node is deleted.
