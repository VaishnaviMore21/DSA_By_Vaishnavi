# Merge Overlapping Subintervals

## Problem statement
Merge all overlapping intervals.

## Intuition
Sort by start, then merge with last accepted interval.

## Brute force explanation
Sort and expand current interval by scanning overlap range.

## Better approach explanation
Use stack to merge progressively.

## Optimal approach explanation
Use list tail instead of stack; same asymptotic complexity.

## Dry run
[[1,3],[2,6],[8,10],[15,18]] => [[1,6],[8,10],[15,18]].

## Edge cases
Single interval, fully overlapping list.

## Time complexity
Brute O(n log n), Better O(n log n), Optimal O(n log n).

## Space complexity
All O(n) due to merged output.

## Interview notes
Sorting is mandatory before linear merge.
