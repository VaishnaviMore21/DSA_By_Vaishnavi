# Check_Palindrome_LinkedList

## Problem statement
Implement Check_Palindrome_LinkedList using LinkedList patterns.

## Intuition
Use node pointer operations and traversal carefully to preserve list structure.

## Brute force
Copy to array and two-pointer compare.

## Better
Stack-based half comparison.

## Optimal
Reverse second half in-place and compare.

## Dry run
Take sample list and trace pointer updates step by step at each node change.

## Edge cases
Empty list, single node list, and minimal valid length inputs.

## Time complexity
O(n)

## Space complexity
O(1) extra for iterative pointer-based methods unless hashing/recursion used.

## Interview notes
Odd length middle node is ignored.
