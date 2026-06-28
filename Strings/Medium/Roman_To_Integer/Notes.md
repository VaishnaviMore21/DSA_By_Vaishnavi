# Roman To Integer

## Problem statement
Convert Roman numeral string to integer.

## Intuition
Smaller numeral before larger means subtraction.

## Brute force
Handle subtraction patterns explicitly then add remaining symbols.

## Better
Left-to-right scan with look-ahead subtraction.

## Optimal
Right-to-left scan using previous value.

## Dry run
MCMXCIV -> 1994.

## Edge cases
Single symbol, repeated symbols.

## Interview notes
Switch-map helper keeps code clean.
