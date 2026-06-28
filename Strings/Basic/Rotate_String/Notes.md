# Rotate String

## Problem statement
Return true if goal can be obtained by rotating s.

## Intuition
All rotations of s appear in s+s.

## Brute force
Generate rotations one by one and compare.

## Better
Check if goal is substring of s+s.

## Optimal
Better and optimal are same practical approach.

## Dry run
s=abcde, goal=cdeab -> true via concatenation abcdeabcde.

## Edge cases
Different lengths, empty strings.

## Interview notes
Concatenation trick is standard expected answer.
