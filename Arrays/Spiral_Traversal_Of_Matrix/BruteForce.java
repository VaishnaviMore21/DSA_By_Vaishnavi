package Arrays.Spiral_Traversal_Of_Matrix;

import java.util.*;

public class BruteForce {
    public static List<Integer> solve(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r = 0, c = 0, dir = 0;

        List<Integer> result = new ArrayList<>();
        for (int step = 0; step < rows * cols; step++) {
            result.add(matrix[r][c]);
            visited[r][c] = true;

            int nr = r + dr[dir], nc = c + dc[dir];
            if (nr < 0 || nr >= rows || nc < 0 || nc >= cols || visited[nr][nc]) {
                dir = (dir + 1) % 4;
                nr = r + dr[dir];
                nc = c + dc[dir];
            }
            r = nr;
            c = nc;
        }
        return result;
    }

    // Time Complexity: O(m*n)
    // Space Complexity: O(m*n)
    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
}
