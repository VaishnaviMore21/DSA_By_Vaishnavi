# Count Inversions

## Problem statement
Count pairs (i,j) such that i<j and arr[i] > arr[j].

## Intuition
During merge, when right element is smaller, remaining left elements form inversions.

## Brute force explanation
Check all pairs.

## Better approach explanation
Insertion sort shift counting (still quadratic).

## Optimal approach explanation
Merge sort based inversion counting.

## Dry run
[5,3,2,4,1] => 8 inversions.

## Edge cases
Sorted array => 0, reverse sorted => max inversions.

## Time complexity
Brute O(n^2), Better O(n^2), Optimal O(n log n).

## Space complexity
Brute O(1), Better O(n), Optimal O(n).

## Interview notes
Explain why (mid-left+1) inversions are added at once.
