# Serialize_Deserialize_BT

## Problem statement
Solve Serialize_Deserialize_BT for binary trees.

## Tree visualization
Use level-order input to build tree and visualize parent-child relationships layer by layer.

## Recursive intuition
Break problem into left subtree and right subtree states, then combine results at current node.

## Brute force
Use straightforward traversal or repeated subtree work.

## Better
Reduce repeated computations with auxiliary structures or combined returns.

## Optimal
Use a single-pass DFS/BFS strategy or direct tree property optimization.
Direct optimal solution is commonly used for this tree problem; brute/better are learning progression variants.

## Dry run
Take sample level-order tree and trace each node visit with intermediate values collected per level/subtree.

## Edge cases
Empty tree, single node tree, skewed tree, and duplicate values.

## Time complexity
BruteForce: often O(n^2) in repeated subtree computations.
Better: often O(n log n) or O(n).
Optimal: typically O(n) where each node is processed once.

## Space complexity
Depends on recursion stack depth, queue usage, and any hash maps/lists used.

## Interview notes
State traversal order, base cases, and why your chosen structure (queue/map/stack) preserves correctness.
