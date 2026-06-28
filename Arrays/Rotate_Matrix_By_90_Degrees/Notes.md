# Rotate Matrix By 90 Degrees

## Problem statement
Rotate square matrix by 90 degrees clockwise.

## Intuition
Position mapping can be simulated or done via transpose+reverse.

## Brute force explanation
Use separate matrix for rotated coordinates.

## Better approach explanation
Copy original matrix, write rotated values in-place.

## Optimal approach explanation
Transpose then reverse each row in-place.

## Dry run
[[1,2,3],[4,5,6],[7,8,9]] -> [[7,4,1],[8,5,2],[9,6,3]].

## Edge cases
1x1 matrix.

## Interview tips
Transpose + row reverse is classic in-place trick.
