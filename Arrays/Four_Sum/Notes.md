# Four Sum

## Problem statement
Find all unique quadruplets with given target sum.

## Intuition
Extend 3-sum idea by fixing two indices then two-pointer.

## Brute force explanation
Try all quadruplets and deduplicate.

## Better approach explanation
Fix i,j and use hash set for third/fourth relation.

## Optimal approach explanation
Sort, fix i,j, then two-pointer with duplicate checks.

## Dry run
[1,0,-1,0,-2,2], target=0 => multiple unique quadruplets.

## Edge cases
Duplicates, large values requiring long sum.

## Time complexity
Brute O(n^4), Better O(n^3), Optimal O(n^3).

## Space complexity
Brute O(k), Better O(n+k), Optimal O(1) excluding output.

## Interview notes
Use long while summing to avoid overflow.
