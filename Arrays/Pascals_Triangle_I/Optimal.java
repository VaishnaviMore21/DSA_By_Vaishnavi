package Arrays.Pascals_Triangle_I;

import java.util.*;

public class Optimal {
    public static long solve(int row, int col) {
        // Multiplicative nCr to avoid factorial overflow for moderate n.
        long result = 1;
        int r = Math.min(col, row - col);
        for (int i = 1; i <= r; i++) {
            result = result * (row - r + i) / i;
        }
        return result;
    }

    // Time Complexity: O(min(col, row-col))
    // Space Complexity: O(1)
    public static void main(String[] args) {
        System.out.println(solve(5, 2));
    }
}
