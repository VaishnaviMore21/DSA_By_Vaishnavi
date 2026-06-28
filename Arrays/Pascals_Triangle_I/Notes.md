# Pascals Triangle I

## Problem statement
Given row and col (0-indexed), find value at Pascal triangle[row][col].

## Intuition
Pascal value is combination C(row, col).

## Brute force explanation
Construct full triangle up to required row.

## Better approach explanation
Use factorial formula for nCr.

## Optimal approach explanation
Use multiplicative nCr for fewer overflow risks.

## Dry run
row=5, col=2 => C(5,2)=10.

## Edge cases
col=0, col=row, row=0.

## Time complexity
Brute O(row^2), Better O(row), Optimal O(min(col,row-col)).

## Space complexity
Brute O(row^2), Better O(1), Optimal O(1).

## Interview notes
Mention zero-based vs one-based indexing clearly.
