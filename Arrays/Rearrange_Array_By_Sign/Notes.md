# Rearrange Array By Sign

## Problem statement
Rearrange so positive and negative elements alternate, starting with positive.

## Intuition
Separate placement positions for positive and negative numbers.

## Brute force explanation
Store positives and negatives separately, then merge alternately.

## Better approach explanation
Same idea with indexed write for paired positions.

## Optimal approach explanation
Directly place values into even/odd indices in one pass.

## Dry run
[3,1,-2,-5,2,-4] -> [3,-2,1,-5,2,-4].

## Edge cases
Equal positive/negative count assumed for this version.

## Interview tips
Mention handling unequal counts in follow-up variant.
