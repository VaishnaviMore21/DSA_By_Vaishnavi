# Maximum Nesting Depth Of Parentheses

## Problem statement
Return maximum depth of nested parentheses in expression.

## Intuition
Depth increases on '(' and decreases on ')'.

## Brute force
Recompute prefix depth for each opening bracket.

## Better
Single pass with running depth and max depth.

## Optimal
Same linear depth counter approach.

## Dry run
"(1+(2*3)+((8)/4))+1" -> max depth 3.

## Edge cases
No parentheses => depth 0.

## Interview notes
Valid expression assumption simplifies handling.
