# Next Permutation

## Problem statement
Find lexicographically next permutation of an array.

## Intuition
Find first descending break from right, then minimally increase prefix.

## Brute force explanation
Generate all permutations and pick next.

## Better approach explanation
Find pivot, swap with suitable successor, sort suffix.

## Optimal approach explanation
Find pivot, swap with rightmost greater element, reverse suffix.

## Dry run
[1,2,3] -> [1,3,2].

## Edge cases
Highest permutation like [3,2,1] -> [1,2,3].

## Interview tips
Why reversing suffix works: it is initially descending.
