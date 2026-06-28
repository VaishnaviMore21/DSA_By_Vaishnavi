# Stock Buy And Sell

## Problem statement
Max profit from one buy and one sell.

## Intuition
Track cheapest buy so far and best sell difference.

## Brute force explanation
Evaluate all buy-sell pairs.

## Better approach explanation
Build suffix max price and compute candidate profit.

## Optimal approach explanation
Single pass with running minimum price.

## Dry run
[7,1,5,3,6,4] -> best profit 5.

## Edge cases
Strictly decreasing prices -> profit 0.

## Interview tips
Sell must happen after buy.
