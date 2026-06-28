package Arrays.Set_Matrix_Zeroes;

import java.util.*;

public class BruteForce {
    public static int[][] solve(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] copy = new int[rows][cols];
        for (int i = 0; i < rows; i++) copy[i] = Arrays.copyOf(matrix[i], cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (copy[i][j] == 0) {
                    for (int c = 0; c < cols; c++) matrix[i][c] = 0;
                    for (int r = 0; r < rows; r++) matrix[r][j] = 0;
                }
            }
        }
        return matrix;
    }

    // Time Complexity: O((m*n)*(m+n))
    // Space Complexity: O(m*n)
    public static void main(String[] args) {
        int[][] ans = solve(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}
