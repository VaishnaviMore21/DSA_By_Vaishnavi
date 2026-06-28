package Arrays.Pascals_Triangle_I;

import java.util.*;

public class BruteForce {
    public static long solve(int row, int col) {
        // Build Pascal triangle till required row.
        List<List<Long>> triangle = new ArrayList<>();
        for (int r = 0; r <= row; r++) {
            List<Long> current = new ArrayList<>();
            for (int c = 0; c <= r; c++) {
                if (c == 0 || c == r) current.add(1L);
                else current.add(triangle.get(r - 1).get(c - 1) + triangle.get(r - 1).get(c));
            }
            triangle.add(current);
        }
        return triangle.get(row).get(col);
    }

    // Time Complexity: O(row^2)
    // Space Complexity: O(row^2)
    public static void main(String[] args) {
        System.out.println(solve(5, 2));
    }
}
