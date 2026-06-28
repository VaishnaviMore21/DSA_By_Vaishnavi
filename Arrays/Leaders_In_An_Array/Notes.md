# Leaders In An Array

## Problem statement
Leader is element >= all elements to its right.

## Intuition
Scanning from right gives current right maximum.

## Brute force explanation
For each element, check all right-side elements.

## Better approach explanation
Right-to-left scan with max tracker.

## Optimal approach explanation
Better and optimal are the same right-scan approach.

## Dry run
[16,17,4,3,5,2] -> leaders [17,5,2].

## Edge cases
Single element, duplicates.

## Interview tips
Collect in reverse order, then reverse result.
