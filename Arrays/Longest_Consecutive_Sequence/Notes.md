# Longest Consecutive Sequence

## Problem statement
Find length of longest consecutive elements sequence.

## Intuition
Sequence start has no predecessor.

## Brute force explanation
Sort then count streak lengths.

## Better approach explanation
Hash set but expand from every number (can repeat work).

## Optimal approach explanation
Hash set and only expand from valid starts.

## Dry run
[100,4,200,1,3,2] -> sequence 1,2,3,4 length 4.

## Edge cases
Duplicates, empty array.

## Interview tips
Explain why start-check avoids redundant expansion.
