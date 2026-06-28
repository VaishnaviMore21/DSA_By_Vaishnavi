# Sum Of Beauty Of All Substrings

## Problem statement
Beauty of substring = max frequency - min frequency (considering only present chars). Return total beauty over all substrings.

## Intuition
Fix start index, expand end index, maintain frequencies incrementally.

## Brute force
For every substring, rebuild frequency array from scratch.

## Better
Maintain running freq while extending end for each start.

## Optimal
In Striver progression, O(n^2 * 26) is considered the practical optimal approach.

## Dry run
"aabcb" -> total beauty 5.

## Edge cases
Single char string contributes 0.

## Interview notes
Do not include zero frequencies in min-frequency calculation.
