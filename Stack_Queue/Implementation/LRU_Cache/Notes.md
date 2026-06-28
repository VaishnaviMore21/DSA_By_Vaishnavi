# LRU_Cache

## Problem statement
Solve LRU_Cache using Stack/Queue based approaches.

## Intuition
Start from a straightforward approach and progressively optimize with better data structure usage.

## Brute force
Use direct simulation or naive traversal with minimal optimization.

## Better
Reduce redundant work using auxiliary stack/queue/hash structure.

## Optimal
Use the most efficient known stack/queue pattern for this problem.
Direct optimal stack/queue formulation is standard for this problem; Brute/Better are for learning progression.

## Visualization
Track stack/queue state after each operation (push/pop/enqueue/dequeue) or each index step.

## Dry run
Walk through a small sample input and record intermediate states after every key operation.

## Edge cases
Empty input, single element, duplicates, strictly increasing/decreasing patterns, and invalid operations.

## Time complexity
BruteForce: typically O(n^2) or operation-dependent simulation.
Better: usually improved to O(n log n) or O(n).
Optimal: typically O(n) or O(1) per operation for designed DS.

## Space complexity
Depends on helper stack/queue/hash/maps used by each approach.

## Interview notes
Clearly explain invariants for stack/queue state and why each element is pushed/popped at most once in monotonic solutions.
