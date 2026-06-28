# Remove Outermost Parentheses

## Problem statement
Given a valid parentheses string, remove the outermost parentheses of each primitive segment.

## Intuition
A primitive starts when balance becomes non-zero and ends when balance returns to zero.

## Brute force
Split primitives first, then drop first and last char of each primitive.

## Better
Single-pass depth tracking and append only non-outer chars.

## Optimal
Better and optimal are effectively the same for this problem.

## Dry run
Input: (()())(()) -> primitives: (()()),(()) -> output: ()()().

## Edge cases
Single primitive (), nested primitive like ((())).

## Interview notes
Depth counter logic is cleaner than manually extracting primitives.
