package Arrays.Pascals_Triangle_I;

import java.util.*;

public class Better {
    public static long solve(int row, int col) {
        return factorial(row) / (factorial(col) * factorial(row - col));
    }

    private static long factorial(int n) {
        long ans = 1;
        for (int i = 2; i <= n; i++) ans *= i;
        return ans;
    }

    // Time Complexity: O(row)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(5, 2));
    }
}
