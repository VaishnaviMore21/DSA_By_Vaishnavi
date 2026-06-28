# Sort Characters By Frequency

## Problem statement
Rearrange string so characters appear in descending frequency.

## Intuition
Need frequency counting plus ordered emission.

## Brute force
Repeatedly pick highest frequency char from map.

## Better
Sort unique chars by frequency.

## Optimal
Bucket sort by frequency from n down to 1.

## Dry run
"tree" -> "eetr" or "eert".

## Edge cases
All chars same, mixed case chars.

## Interview notes
Any order among equal frequencies is usually valid.
