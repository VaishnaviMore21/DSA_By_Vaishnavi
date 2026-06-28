# Merge Two Sorted Arrays Without Extra Space

## Problem statement
Merge two sorted arrays so both remain sorted, without extra merge array.

## Intuition
Correct elements belong to left array first, right array later.

## Brute force explanation
Combine, sort, and split back.

## Better approach explanation
Swap out-of-order boundary elements, then sort each array.

## Optimal approach explanation
Use gap method over virtual combined array.

## Dry run
a=[1,4,8,10], b=[2,3,9] => a=[1,2,3,4], b=[8,9,10].

## Edge cases
Already merged order, one array empty.

## Time complexity
Brute O((n+m)log(n+m)), Better O(nlogn+mlogm), Optimal O((n+m)log(n+m)).

## Space complexity
Brute O(n+m), Better O(1), Optimal O(1).

## Interview notes
Gap method is expected in many Striver-style interviews.
