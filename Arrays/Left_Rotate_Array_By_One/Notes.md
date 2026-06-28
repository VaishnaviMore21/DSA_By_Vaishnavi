# Left Rotate Array By One

## Problem statement
Rotate array left by one position.

## Intuition
Store first element, shift left, append stored value.

## Brute force explanation
Use temp array and copy.

## Better approach explanation
In-place shift with one temporary variable.

## Optimal approach explanation
Better and optimal are same in-place O(1) extra space method.

## Dry run
[1,2,3,4] -> [2,3,4,1].

## Edge cases
Length 0 or 1.

## Interview tips
Mention in-place mutation clearly.
