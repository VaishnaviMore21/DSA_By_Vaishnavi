package Arrays.Set_Matrix_Zeroes;

import java.util.*;

public class Optimal {
    public static int[][] solve(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        boolean firstColZero = false;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) firstColZero = true;
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }

        if (matrix[0][0] == 0) {
            for (int j = 0; j < cols; j++) matrix[0][j] = 0;
        }
        if (firstColZero) {
            for (int i = 0; i < rows; i++) matrix[i][0] = 0;
        }
        return matrix;
    }

    // Time Complexity: O(m*n)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        int[][] ans = solve(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}
