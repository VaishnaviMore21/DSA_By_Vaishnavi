package Arrays.Stock_Buy_And_Sell;

import java.util.*;

public class Optimal {
    public static int solve(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
