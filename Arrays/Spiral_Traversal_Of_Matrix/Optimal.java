package Arrays.Spiral_Traversal_Of_Matrix;

import java.util.*;

public class Optimal {
    public static List<Integer> solve(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        List<Integer> result = new ArrayList<>();

        while (top <= bottom && left <= right) {
            for (int c = left; c <= right; c++) result.add(matrix[top][c]);
            top++;

            for (int r = top; r <= bottom; r++) result.add(matrix[r][right]);
            right--;

            if (top <= bottom) {
                for (int c = right; c >= left; c--) result.add(matrix[bottom][c]);
                bottom--;
            }

            if (left <= right) {
                for (int r = bottom; r >= top; r--) result.add(matrix[r][left]);
                left++;
            }
        }
        return result;
    }

    // Time Complexity: O(m*n)
    // Space Complexity: O(1) excluding output
    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
