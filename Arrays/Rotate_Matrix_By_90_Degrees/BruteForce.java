package Arrays.Rotate_Matrix_By_90_Degrees;

import java.util.*;

public class BruteForce {
    public static int[][] solve(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];
            }
        }
        return rotated;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n^2)
    public static void main(String[] args) {
        int[][] ans = solve(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}
