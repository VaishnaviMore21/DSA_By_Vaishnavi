# Remove Duplicates from Sorted Array

## Problem statement
Remove duplicates in-place and return new length.

## Intuition
Sorted array groups duplicates together.

## Brute force explanation
Use set, then write back.

## Better approach explanation
Two pointers: read scans all, write stores unique values.

## Optimal approach explanation
Better and optimal are same two-pointer in-place strategy.

## Dry run
[1,1,2,2,3] -> [1,2,3,...], length=3.

## Edge cases
All duplicates, no duplicates, empty array.

## Interview tips
Clarify that only first k elements matter after operation.
