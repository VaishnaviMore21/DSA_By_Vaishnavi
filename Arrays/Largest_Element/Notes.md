# Largest Element

## Problem statement
Find the maximum element in the array.

## Intuition
Track the largest value seen while scanning once.

## Brute force explanation
Sort and pick last element, or scan once.

## Better approach explanation
For this problem, better and optimal are same single-pass scan.

## Optimal approach explanation
Single traversal, update max when current value is larger.

## Dry run
[3,1,2,5,4] -> max updates: 3 -> 5.

## Edge cases
Single element, all equal, all negative.

## Interview tips
Mention that sorting is unnecessary if only max value is needed.
