package Arrays.Rotate_Matrix_By_90_Degrees;

import java.util.*;

public class Better {
    public static int[][] solve(int[][] matrix) {
        int n = matrix.length;
        int[][] copy = new int[n][n];
        for (int i = 0; i < n; i++) copy[i] = Arrays.copyOf(matrix[i], n);

        // Write rotated values back in-place using copy.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[j][n - 1 - i] = copy[i][j];
            }
        }
        return matrix;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n^2)
    public static void main(String[] args) {
        int[][] ans = solve(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}
