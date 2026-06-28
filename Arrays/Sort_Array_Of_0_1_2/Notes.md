# Sort Array Of 0 1 2

## Problem statement
Sort an array containing only 0s, 1s, and 2s.

## Intuition
Values are limited to three categories.

## Brute force explanation
Use built-in sorting.

## Better approach explanation
Count occurrences and rebuild.

## Optimal approach explanation
Use Dutch National Flag with low, mid, high pointers.

## Dry run
[2,0,2,1,1,0] -> [0,0,1,1,2,2].

## Edge cases
All same values, empty array.

## Interview tips
DNF is in-place and one-pass.
