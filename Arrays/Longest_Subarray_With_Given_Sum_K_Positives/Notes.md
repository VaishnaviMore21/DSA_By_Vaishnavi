# Longest Subarray With Given Sum K Positives

## Problem statement
Find longest subarray length with sum exactly k for positive numbers.

## Intuition
Positive elements allow shrinking window when sum exceeds k.

## Brute force explanation
Try all subarrays and compute sums.

## Better approach explanation
Sliding window using two pointers.

## Optimal approach explanation
Better and optimal are same O(n) sliding window for positives only.

## Dry run
[1,2,1,1,1], k=3 -> longest length 3.

## Edge cases
No valid subarray.

## Interview tips
Mention this fails with negatives.
