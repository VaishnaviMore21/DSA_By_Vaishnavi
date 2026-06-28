# Union of Two Sorted Arrays

## Problem statement
Return unique sorted union of two sorted arrays.

## Intuition
Sorted arrays can be merged while skipping duplicates.

## Brute force explanation
Insert both arrays into ordered set.

## Better approach explanation
Two-pointer merge and deduplicate on the fly.

## Optimal approach explanation
Better and optimal are same linear merge for sorted input.

## Dry run
a=[1,2,2,3], b=[2,4] -> [1,2,3,4].

## Edge cases
One array empty, all overlapping.

## Interview tips
Highlight why sorted property reduces complexity.
