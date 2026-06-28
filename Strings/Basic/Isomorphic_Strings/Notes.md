# Isomorphic Strings

## Problem statement
Check whether each char in s maps to exactly one char in t and vice versa.

## Intuition
Need bijection, not just one-way mapping.

## Brute force
Pairwise relationship consistency check across all indices.

## Better
Two hash maps to enforce both directions.

## Optimal
Array-based last-seen mapping for constant space (fixed charset).

## Dry run
"egg" vs "add" => true; "foo" vs "bar" => false.

## Edge cases
Different lengths, repeated patterns.

## Interview notes
Always validate reverse mapping too.
