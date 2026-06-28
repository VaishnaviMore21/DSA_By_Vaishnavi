package Arrays.Merge_Two_Sorted_Arrays_Without_Extra_Space;

import java.util.*;

public class BruteForce {
    public static String solve(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int idx = 0;
        for (int x : a) merged[idx++] = x;
        for (int x : b) merged[idx++] = x;
        Arrays.sort(merged);

        for (int i = 0; i < a.length; i++) a[i] = merged[i];
        for (int i = 0; i < b.length; i++) b[i] = merged[a.length + i];
        return Arrays.toString(a) + " | " + Arrays.toString(b);
    }

    // Time Complexity: O((n+m) log(n+m))
    // Space Complexity: O(n+m)
    public static void main(String[] args) {
        int[] a = {1, 4, 8, 10};
        int[] b = {2, 3, 9};
        System.out.println(solve(a, b));
    }
}
