# Letter_Combinations_Of_Phone_Number

## Problem statement
Implement Letter_Combinations_Of_Phone_Number in recursive/backtracking style as per Striver A2Z ordering.

## Recursive intuition
Break the problem into smaller states and move through decision branches using recursion.

## Brute force
Explore all choices recursively with minimal pruning.

## Better
Apply pruning/constraint checks to cut invalid recursion branches earlier.

## Optimal
Use memoization or stronger pruning where applicable.
If recursion itself is the optimal approach for this problem, Better and Optimal may differ only in implementation details.

## Recursion tree / dry run
Example with a small input (like n=3): root state branches into include/exclude (or choice-1/choice-2) until a base condition is reached.
Track state transitions level by level to verify correctness.

## Base cases
Stop recursion when target state is reached, index runs out, or an invalid state is detected.

## Edge cases
Empty input, minimal valid input, duplicate values, and impossible target states.

## Time complexity
BruteForce: typically exponential in branching problems.
Better: reduced practical runtime via pruning.
Optimal: often polynomial with memoization; otherwise best practical recursive pruning.

## Space complexity
Recursion stack depth + any auxiliary structures (path, set, memo map).

## Interview notes
Explain base cases first, then recursion relation, then how pruning/memoization improves performance.
