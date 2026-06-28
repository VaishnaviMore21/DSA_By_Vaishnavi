# Largest Subarray With Sum Zero

## Problem statement
Find length of longest subarray with sum 0.

## Intuition
Same prefix sum seen twice means zero-sum subarray between those indices.

## Brute force explanation
Check all subarrays and track max zero-sum length.

## Better approach explanation
Prefix array avoids repeated summation but still checks all pairs.

## Optimal approach explanation
Hash map stores first occurrence of each prefix sum.

## Dry run
[15,-2,2,-8,1,7,10,23] => longest length 5.

## Edge cases
No zero-sum subarray, entire array sums to zero.

## Time complexity
Brute O(n^2), Better O(n^2), Optimal O(n).

## Space complexity
Brute O(1), Better O(n), Optimal O(n).

## Interview notes
Store first index only to maximize length.
