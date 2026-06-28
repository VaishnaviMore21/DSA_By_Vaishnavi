# Two Sum

## Problem statement
Given an array and target, return indices of two numbers whose sum equals target.

## Intuition
Find two values that complete each other to make target.

## Brute force explanation
Try all pairs and return first valid one.

## Better approach explanation
Sort value-index pairs and use two pointers.

## Optimal approach explanation
Use hash map to find complement in O(1) average lookup.

## Dry run
[2,7,11,15], target=9 -> need 7 when at 2; found at index 1.

## Edge cases
No solution, duplicate values, negative numbers.

## Interview tips
Mention map stores value -> index and why it is linear.
