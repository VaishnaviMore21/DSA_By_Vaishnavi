package Arrays.Set_Matrix_Zeroes;

import java.util.*;

public class Better {
    public static int[][] solve(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRows[i] || zeroCols[j]) matrix[i][j] = 0;
            }
        }
        return matrix;
    }

    // Time Complexity: O(m*n)
    // Space Complexity: O(m+n)
    public static void main(String[] args) {
        int[][] ans = solve(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}
