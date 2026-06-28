# Remove_Duplicates_From_Sorted_DLL

## Problem statement
Implement Remove_Duplicates_From_Sorted_DLL using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Use extra set to rebuild unique nodes.

## Better
Traverse and skip equal next nodes.

## Optimal
In-place duplicate removal in one pass.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for pointer rewiring unless additional data structures are used.

## Interview notes
Input must be sorted for adjacent duplicate detection.
