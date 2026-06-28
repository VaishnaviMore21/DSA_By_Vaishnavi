# Reverse Pairs

## Problem statement
Count pairs (i,j) where i<j and arr[i] > 2*arr[j].

## Intuition
Merge-sort halves are sorted, allowing linear cross-pair counting.

## Brute force explanation
Check all pairs.

## Better approach explanation
No standard distinct better approach is commonly used in Striver progression.

## Optimal approach explanation
Merge sort + two-pointer counting across halves.

## Dry run
[1,3,2,3,1] => reverse pairs = 2.

## Edge cases
Large numbers (use long), negatives.

## Time complexity
Brute O(n^2), Better O(n^2), Optimal O(n log n).

## Space complexity
Brute O(1), Better O(1), Optimal O(n).

## Interview notes
Count before merge; otherwise ordering changes and pair logic breaks.
