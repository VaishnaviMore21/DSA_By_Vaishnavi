# Longest Common Prefix

## Problem statement
Find longest common prefix among given strings.

## Intuition
Common prefix must match across all strings at same positions.

## Brute force
Try all prefixes of first string from longest to shortest.

## Better
Progressively shrink prefix while scanning strings.

## Optimal
Sort and compare only first and last strings.

## Dry run
[flower,flow,flight] -> "fl".

## Edge cases
Empty array, empty string inside array.

## Interview notes
Sort trick is concise and often accepted.
