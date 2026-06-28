# Majority Element II

## Problem statement
Find all elements appearing more than floor(n/3) times.

## Intuition
At most two elements can satisfy count > n/3.

## Brute force explanation
Count frequency for each element by scanning all elements.

## Better approach explanation
Hash map frequency tracking.

## Optimal approach explanation
Boyer-Moore with two candidates and verification pass.

## Dry run
[3,2,3,2,2,1,1] => [2].

## Edge cases
No majority elements, one element array.

## Time complexity
Brute O(n^2), Better O(n), Optimal O(n).

## Space complexity
Brute O(1), Better O(n), Optimal O(1).

## Interview notes
Explain why max two candidates exist for n/3 threshold.
