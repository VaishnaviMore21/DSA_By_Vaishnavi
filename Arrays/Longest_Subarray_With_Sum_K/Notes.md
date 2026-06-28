# Longest Subarray With Sum K

## Problem statement
Find longest subarray length with sum exactly k (array can contain negatives).

## Intuition
Use prefix sum and earliest index to maximize length.

## Brute force explanation
Try all subarrays.

## Better approach explanation
Prefix sum hash map gives O(n).

## Optimal approach explanation
For mixed integers, hash map prefix sum is the optimal standard approach.

## Dry run
[1,-1,5,-2,3], k=3 -> longest length 4.

## Edge cases
k=0, negatives only, no valid subarray.

## Interview tips
Store first occurrence of prefix sum only.
