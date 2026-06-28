# Majority Element I

## Problem statement
Find element appearing more than n/2 times.

## Intuition
Majority element cannot be canceled out completely.

## Brute force explanation
Count each element frequency with nested loops.

## Better approach explanation
Use hash map frequency count.

## Optimal approach explanation
Boyer-Moore voting with optional verification.

## Dry run
[2,2,1,1,1,2,2] -> candidate survives as 2.

## Edge cases
No majority (if constraint allows), single element.

## Interview tips
Explain cancellation idea behind Boyer-Moore.
