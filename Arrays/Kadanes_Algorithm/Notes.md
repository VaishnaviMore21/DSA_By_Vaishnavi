# Kadanes Algorithm

## Problem statement
Find maximum sum of a contiguous subarray.

## Intuition
At each index, decide start new subarray or extend current one.

## Brute force explanation
Try all subarrays and track max sum.

## Better approach explanation
DP array storing max sum ending at each index.

## Optimal approach explanation
Kadane compresses DP to O(1) space.

## Dry run
[-2,1,-3,4,-1,2,1,-5,4] -> max sum = 6 from [4,-1,2,1].

## Edge cases
All negative numbers, single element.

## Interview tips
Mention handling all-negative case correctly.
