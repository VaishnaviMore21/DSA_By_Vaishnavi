# String To Integer Atoi

## Problem statement
Implement atoi behavior with whitespace, sign, digits, and overflow clamps.

## Intuition
Parse in phases: spaces, sign, digits, clamp.

## Brute force
Extract digit substring and parse with try/catch.

## Better
Manual parse using long and overflow checks.

## Optimal
Manual parse using int with pre-overflow guard.

## Dry run
"   -42" => -42, "4193 with words" => 4193.

## Edge cases
Empty string, only sign, overflow, non-digit prefix.

## Interview notes
Must stop parsing at first non-digit after digits start.
