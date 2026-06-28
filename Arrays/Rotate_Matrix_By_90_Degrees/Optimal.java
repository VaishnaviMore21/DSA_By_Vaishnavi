package Arrays.Rotate_Matrix_By_90_Degrees;

import java.util.*;

public class Optimal {
    public static int[][] solve(int[][] matrix) {
        int n = matrix.length;

        // Transpose.
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row.
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        return matrix;
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        int[][] ans = solve(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        for (int[] row : ans) System.out.println(Arrays.toString(row));
    }
}
