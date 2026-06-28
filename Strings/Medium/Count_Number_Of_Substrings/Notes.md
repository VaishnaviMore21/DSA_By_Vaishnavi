# Count Number Of Substrings

## Problem statement
Count substrings with exactly k distinct characters.

## Intuition
exactly(k) = atMost(k) - atMost(k-1).

## Brute force
Enumerate all substrings and track distinct chars.

## Better
Sliding window with hash map for atMost counts.

## Optimal
Sliding window with fixed-size frequency array.

## Dry run
s="pqpqs", k=2 => answer 7.

## Edge cases
k=0, k greater than unique chars.

## Interview notes
Clarify problem variant if interviewer says only "count substrings".
