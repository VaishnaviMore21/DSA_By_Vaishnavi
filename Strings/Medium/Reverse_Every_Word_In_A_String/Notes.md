# Reverse Every Word In A String

## Problem statement
Reverse characters of each word while preserving word order and spaces.

## Intuition
Each space-delimited segment can be reversed independently.

## Brute force
Split words and reverse each with StringBuilder.

## Better
Manual scanning and append reversed word segments.

## Optimal
Reverse each word in char array using two pointers.

## Dry run
"Let's code" -> "s'teL edoc".

## Edge cases
Multiple consecutive spaces, single word.

## Interview notes
Clarify whether exact spacing must be preserved.
