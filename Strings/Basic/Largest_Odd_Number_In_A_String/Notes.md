# Largest Odd Number In A String

## Problem statement
Given numeric string, return largest-valued odd-number substring that is a prefix.

## Intuition
Largest prefix means choose rightmost odd digit as end.

## Brute force
Try all prefixes from longest to shortest and check parity.

## Better
Right-to-left scan for first odd digit.

## Optimal
Same as better; this is already optimal linear scan.

## Dry run
"35427" -> rightmost odd at index 4 => "35427".

## Edge cases
No odd digit => empty string.

## Interview notes
Do not parse to integer; keep as string.
