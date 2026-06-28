# Second Largest Element

## Problem statement
Find the second largest distinct element.

## Intuition
Need top two distinct values.

## Brute force explanation
Sort and scan from end for first distinct value below max.

## Better approach explanation
Find largest, then second pass for best value not equal to largest.

## Optimal approach explanation
Maintain largest and secondLargest in one pass.

## Dry run
[2,5,1,5,4] -> largest=5, secondLargest=4.

## Edge cases
All elements equal -> return -1.

## Interview tips
Clarify distinctness requirement.
