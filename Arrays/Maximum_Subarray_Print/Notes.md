# Maximum Subarray Print

## Problem statement
Print the subarray with maximum sum.

## Intuition
Need both max sum and its start/end indices.

## Brute force explanation
Check all subarrays and store best boundaries.

## Better approach explanation
Prefix sum reduces repeated summation but still O(n^2).

## Optimal approach explanation
Kadane with index tracking returns best range in O(n).

## Dry run
[-2,1,-3,4,-1,2,1,-5,4] -> [4,-1,2,1].

## Edge cases
All negatives, single element.

## Interview tips
When restarting current sum, reset potential start index.
