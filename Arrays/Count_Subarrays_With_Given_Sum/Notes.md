# Count Subarrays With Given Sum

## Problem statement
Count number of subarrays whose sum equals k.

## Intuition
If prefixSum[j] - prefixSum[i] = k, then subarray (i+1..j) is valid.

## Brute force explanation
Check sum for all subarrays.

## Better approach explanation
Use prefix array to compute subarray sum in O(1) per pair.

## Optimal approach explanation
Use hash map of prefix sum frequencies.

## Dry run
[1,1,1], k=2 -> subarrays [1,1] at (0,1) and (1,2), answer 2.

## Edge cases
Negative values, k=0, empty array.

## Interview tips
Initialize map with (0 -> 1) for subarrays starting at index 0.
