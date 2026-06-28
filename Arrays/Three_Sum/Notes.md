# Three Sum

## Problem statement
Find all unique triplets with sum zero.

## Intuition
Sort and fix one element, then solve 2-sum on remaining range.

## Brute force explanation
Try all i,j,k triplets and deduplicate.

## Better approach explanation
For each i, use hash set for 2-sum style search.

## Optimal approach explanation
Sort + two pointers with duplicate skipping.

## Dry run
[-1,0,1,2,-1,-4] => [[-1,-1,2],[-1,0,1]].

## Edge cases
All zeros, no triplet, duplicates.

## Time complexity
Brute O(n^3), Better O(n^2), Optimal O(n^2).

## Space complexity
Brute O(k), Better O(n+k), Optimal O(1) excluding output.

## Interview notes
Duplicate handling is usually the trickiest part.
