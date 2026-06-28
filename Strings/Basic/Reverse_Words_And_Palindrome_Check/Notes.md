# Reverse Words And Palindrome Check

## Problem statement
Implement two utilities: reverse words in a sentence and check if a string is palindrome (ignoring non-alphanumeric/case).

## Intuition
Word reversal needs token order reversal; palindrome needs mirrored character comparison.

## Brute force
Split/reverse/join words and compare cleaned string with its reversed copy.

## Better
Build reversed words with loop and two-pointer palindrome scan.

## Optimal
No meaningful asymptotic improvement beyond O(n); implementation-level optimization only.

## Dry run
"the sky is blue" -> "blue is sky the"; "A man, a plan..." -> palindrome true.

## Edge cases
Empty string, multiple spaces, punctuation-only input.

## Interview notes
Clarify whether in-place char-array reversal is required for words.
