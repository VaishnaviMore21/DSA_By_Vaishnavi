# Find Repeating And Missing Number

## Problem statement
Array contains numbers 1..n with one missing and one repeating. Find both.

## Intuition
Compare expected frequency/sum with actual values.

## Brute force explanation
Count each value from 1..n using nested loops.

## Better approach explanation
Use frequency array.

## Optimal approach explanation
Use sum and square sum equations to derive two variables.

## Dry run
[3,1,2,5,3] => repeating=3, missing=4.

## Edge cases
Small n like 2.

## Time complexity
Brute O(n^2), Better O(n), Optimal O(n).

## Space complexity
Brute O(1), Better O(n), Optimal O(1).

## Interview notes
Use long to avoid overflow in squared sums.
