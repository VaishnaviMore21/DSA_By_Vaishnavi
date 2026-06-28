# Number Appears Once

## Problem statement
Every number appears twice except one; find that unique number.

## Intuition
Pairs cancel under XOR.

## Brute force explanation
Count frequency for each element using nested loops.

## Better approach explanation
Use hash map frequencies.

## Optimal approach explanation
XOR all values; duplicate pairs cancel, unique remains.

## Dry run
[4,1,2,1,2] -> 4.

## Edge cases
Single element.

## Interview tips
State XOR properties explicitly.
