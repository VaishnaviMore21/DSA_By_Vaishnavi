# Set Matrix Zeroes

## Problem statement
If element is 0, set its whole row and column to 0.

## Intuition
Need markers so newly set zeros do not cascade incorrectly.

## Brute force explanation
Use matrix copy to detect original zeros.

## Better approach explanation
Track zero rows and zero columns arrays.

## Optimal approach explanation
Use first row/column as markers and one extra flag.

## Dry run
[[1,1,1],[1,0,1],[1,1,1]] -> middle row and col become zero.

## Edge cases
Zero in first row/first column.

## Interview tips
Explain why firstCol flag is needed.
