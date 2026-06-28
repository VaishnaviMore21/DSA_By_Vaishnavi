# Valid Anagram

## Problem statement
Check whether two strings are anagrams.

## Intuition
Anagrams have identical character frequencies.

## Brute force
Sort both strings and compare.

## Better
Hash map frequency counting.

## Optimal
Fixed-size frequency array for lowercase letters.

## Dry run
"anagram" vs "nagaram" -> true.

## Edge cases
Different lengths, unicode/uppercase variant.

## Interview notes
Ask charset constraints before choosing array size.
