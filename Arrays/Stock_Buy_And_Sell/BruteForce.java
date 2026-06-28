package Arrays.Stock_Buy_And_Sell;

import java.util.*;

public class BruteForce {
    public static int solve(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
            }
        }
        return maxProfit;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
