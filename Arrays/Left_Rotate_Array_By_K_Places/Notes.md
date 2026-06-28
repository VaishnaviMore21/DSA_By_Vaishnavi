# Left Rotate Array By K Places

## Problem statement
Rotate array left by k positions.

## Intuition
After rotation, index mapping changes cyclically.

## Brute force explanation
Use temporary array with mapped positions.

## Better approach explanation
Use reversal algorithm in-place.

## Optimal approach explanation
Better and optimal are same reversal method with O(1) extra space.

## Dry run
[1,2,3,4,5], k=2 -> [3,4,5,1,2].

## Edge cases
k=0, k>=n, empty array.

## Interview tips
Always normalize k as k % n.
