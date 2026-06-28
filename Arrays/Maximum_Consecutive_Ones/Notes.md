# Maximum Consecutive Ones

## Problem statement
Find maximum number of consecutive 1s in binary array.

## Intuition
Track current streak and best streak.

## Brute force explanation
Count streaks while scanning.

## Better approach explanation
Better and optimal are same one-pass streak counting.

## Optimal approach explanation
Update best whenever current streak increases.

## Dry run
[1,1,0,1,1,1] -> 3.

## Edge cases
All zeros, all ones.

## Interview tips
Reset counter immediately on zero.
