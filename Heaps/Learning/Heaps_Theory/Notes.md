# Heaps_Theory

## Problem statement
Solve Heaps_Theory using heap-oriented techniques.

## Heap visualization
Track heap content after each insert/remove operation and observe top element changes.

## Intuition
Use ordering property of heaps to quickly access min/max priorities.

## Brute force
Use sorting or repeated scans for selection/priority behavior.

## Better
Use partial heaps or improved data handling to reduce repeated work.

## Optimal
Use PriorityQueue-based strategy with appropriate min-heap/max-heap configuration.
Heap/PriorityQueue based approach is the direct optimal pattern for this problem.

## Dry run
Run a small input manually and log heap state after each operation.

## Edge cases
Empty input, k out of range, duplicate values, negative numbers, and stream query before insert.

## Time complexity
BruteForce: often O(n^2) or O(n log n) with full sorting.
Better: often O(n log k) or O(n log n).
Optimal: typically O(n log k) / O(log n) per operation depending on problem.

## Space complexity
Depends on heap size, auxiliary maps/sets, and output storage.

## Interview notes
Explain why min-heap vs max-heap is chosen and how invariants are preserved.
