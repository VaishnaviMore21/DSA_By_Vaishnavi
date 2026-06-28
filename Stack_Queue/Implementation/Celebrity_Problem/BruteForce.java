package Stack_Queue.Implementation.Celebrity_Problem;

import java.util.*;

public class BruteForce {
    private static int solve(int[][] mat) {
        // TODO: Implement Celebrity_Problem logic for this approach.
        // Placeholder returns total cells.
        return mat.length == 0 ? 0 : mat.length * mat[0].length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // rows cols
        // matrix elements row-wise
        int rows = sc.hasNextInt() ? sc.nextInt() : 0;
        int cols = sc.hasNextInt() ? sc.nextInt() : 0;
        int[][] mat = new int[Math.max(rows, 0)][Math.max(cols, 0)];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (sc.hasNextInt()) mat[i][j] = sc.nextInt();
            }
        }

        int ans = solve(mat);
        System.out.println("Result: " + ans);

        sc.close();
    }
}
