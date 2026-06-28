package Heaps.Hard.Maximum_Sum_Combination;

import java.util.*;

public class Better {
    private static int solve(int[] arr, int k) {
        // TODO: Implement Maximum_Sum_Combination for this approach.
        // Placeholder: return kth candidate safely.
        if (arr.length == 0) return -1;
        int idx = Math.max(1, Math.min(k, arr.length)) - 1;
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return copy[idx];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input format:
        // n
        // n array elements
        // k
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] arr = new int[Math.max(0, n)];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) arr[i] = sc.nextInt();
        }
        int k = sc.hasNextInt() ? sc.nextInt() : 1;

        int ans = solve(arr, k);
        System.out.println("Result: " + ans);

        sc.close();
    }
}
