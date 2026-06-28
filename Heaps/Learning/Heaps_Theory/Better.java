package Heaps.Learning.Heaps_Theory;

import java.util.*;

public class Better {
    private static String solve(int[] arr) {
        // TODO: Implement Heaps_Theory for this approach.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int x : arr) pq.offer(x);
        return pq.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input format:
        // n
        // n array elements
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] arr = new int[Math.max(0, n)];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) arr[i] = sc.nextInt();
        }

        System.out.println("Result: " + solve(arr));
        sc.close();
    }
}
