# Count Subarrays With XOR K

## Problem statement
Count subarrays whose XOR equals k.

## Intuition
If prefixXor up to j is xr, then previous prefix xor should be xr ^ k.

## Brute force explanation
Try all subarrays and compute running xor.

## Better approach explanation
Use prefix xor array for cleaner pair evaluation.

## Optimal approach explanation
Hash map of prefix xor frequencies.

## Dry run
[4,2,2,6,4], k=6 => answer 4.

## Edge cases
k=0, all same values.

## Time complexity
Brute O(n^2), Better O(n^2), Optimal O(n).

## Space complexity
Brute O(1), Better O(n), Optimal O(n).

## Interview notes
Initialize map with xor 0 count 1.
