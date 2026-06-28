# Maximum Product Subarray

## Problem statement
Find maximum product among all contiguous subarrays.

## Intuition
Negative number can turn smallest product into largest and vice versa.

## Brute force explanation
Compute product for every subarray.

## Better approach explanation
Prefix and suffix product scans capture zero-separated segments.

## Optimal approach explanation
Track maxEnding and minEnding at each index.

## Dry run
[2,3,-2,4] => max product 6.

## Edge cases
Contains zeros, all negatives, single element.

## Time complexity
Brute O(n^2), Better O(n), Optimal O(n).

## Space complexity
All approaches O(1) extra.

## Interview notes
Need both min and max because negative flips sign impact.
