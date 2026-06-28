# Longest Palindromic Substring

## Problem statement
Find longest contiguous palindromic substring.

## Intuition
Palindrome expands around center.

## Brute force
Check all substrings and test palindrome.

## Better
Dynamic programming over substring lengths.

## Optimal
Expand-around-center for every index and gap.

## Dry run
"babad" -> "bab" or "aba".

## Edge cases
Single char, all same chars.

## Interview notes
Center expansion is usually preferred over DP for space.
