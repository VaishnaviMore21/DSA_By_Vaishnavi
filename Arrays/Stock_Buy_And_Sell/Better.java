package Arrays.Stock_Buy_And_Sell;

import java.util.*;

public class Better {
    public static int solve(int[] prices) {
        int[] suffixMax = new int[prices.length];
        suffixMax[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(prices[i], suffixMax[i + 1]);
        }

        int best = 0;
        for (int i = 0; i < prices.length; i++) {
            best = Math.max(best, suffixMax[i] - prices[i]);
        }
        return best;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(solve(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
