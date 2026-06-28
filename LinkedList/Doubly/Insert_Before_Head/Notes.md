# Insert_Before_Head

## Problem statement
Implement Insert_Before_Head using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Create node and adjust old head.prev.

## Better
Same pointer rewiring.

## Optimal
Constant-time insertion is optimal.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(1)

## Space complexity
O(1) extra for pointer rewiring unless additional data structures are used.

## Interview notes
Do not forget prev pointer of new head should remain null.
