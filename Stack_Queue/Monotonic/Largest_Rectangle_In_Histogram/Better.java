package Stack_Queue.Monotonic.Largest_Rectangle_In_Histogram;

import java.util.*;

public class Better {
    private static int solve(int[] arr) {
        // TODO: Implement Largest_Rectangle_In_Histogram logic for this approach.
        // Placeholder returns array length to keep the file runnable.
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // n
        // a1 a2 a3 ... an
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] arr = new int[Math.max(n, 0)];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) arr[i] = sc.nextInt();
        }

        int ans = solve(arr);
        System.out.println("Result: " + ans);

        sc.close();
    }
}
