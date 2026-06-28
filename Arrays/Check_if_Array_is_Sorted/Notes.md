# Check if Array is Sorted

## Problem statement
Return true/false (or 1/0) if array is non-decreasing.

## Intuition
Any inversion proves not sorted.

## Brute force explanation
Compare every adjacent pair.

## Better approach explanation
Better and optimal are same adjacent-scan.

## Optimal approach explanation
Single pass, fail early on first inversion.

## Dry run
[1,2,2,4] sorted; [1,3,2] not sorted.

## Edge cases
Empty/single-element arrays are sorted.

## Interview tips
Mention non-decreasing vs strictly increasing.
