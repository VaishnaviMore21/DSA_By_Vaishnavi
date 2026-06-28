# Move Zeros To End

## Problem statement
Move all zeros to end while maintaining non-zero order.

## Intuition
Keep non-zero values compacted at front.

## Brute force explanation
Collect non-zeros then fill trailing zeros.

## Better approach explanation
Two-pointer in-place swapping for compaction.

## Optimal approach explanation
Better and optimal are same stable in-place two-pointer approach.

## Dry run
[0,1,0,3,12] -> [1,3,12,0,0].

## Edge cases
All zeros, no zeros.

## Interview tips
Preserve relative order of non-zero values.
