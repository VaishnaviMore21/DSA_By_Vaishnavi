# Find Missing Number

## Problem statement
Given numbers from 1..n with one missing, find missing value.

## Intuition
Expected set differs from observed set by exactly one element.

## Brute force explanation
Check each candidate by scanning array.

## Better approach explanation
Use frequency/presence array.

## Optimal approach explanation
Use XOR of 1..n and array values.

## Dry run
n=5, arr=[1,2,3,5] -> missing=4.

## Edge cases
Missing first or last number.

## Interview tips
Discuss sum and XOR; XOR avoids overflow.
