# Spiral Traversal Of Matrix

## Problem statement
Return all elements of matrix in spiral order.

## Intuition
Traverse layer by layer with shrinking boundaries.

## Brute force explanation
Direction simulation with visited matrix.

## Better approach explanation
Boundary pointers top/bottom/left/right.

## Optimal approach explanation
Better and optimal are the same boundary traversal.

## Dry run
[[1,2,3],[4,5,6],[7,8,9]] -> [1,2,3,6,9,8,7,4,5].

## Edge cases
Single row, single column.

## Interview tips
Always check boundaries before bottom/left traversals.
