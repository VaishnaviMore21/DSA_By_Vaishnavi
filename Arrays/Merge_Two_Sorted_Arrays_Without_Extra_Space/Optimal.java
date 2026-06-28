package Arrays.Merge_Two_Sorted_Arrays_Without_Extra_Space;

import java.util.*;

public class Optimal {
    public static String solve(int[] a, int[] b) {
        int n = a.length, m = b.length;
        int len = n + m;
        int gap = (len / 2) + (len % 2);

        // Gap method similar to Shell sort.
        while (gap > 0) {
            int left = 0;
            int right = left + gap;

            while (right < len) {
                if (left < n && right >= n) {
                    swapIfGreater(a, b, left, right - n);
                } else if (left >= n) {
                    swapIfGreater(b, b, left - n, right - n);
                } else {
                    swapIfGreater(a, a, left, right);
                }
                left++;
                right++;
            }

            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }

        return Arrays.toString(a) + " | " + Arrays.toString(b);
    }

    private static void swapIfGreater(int[] x, int[] y, int i, int j) {
        if (x[i] > y[j]) {
            int temp = x[i];
            x[i] = y[j];
            y[j] = temp;
        }
    }

    // Time Complexity: O((n+m) log(n+m))
    // Space Complexity: O(1)
    public static void main(String[] args) {
        int[] a = {1, 4, 8, 10};
        int[] b = {2, 3, 9};
        System.out.println(solve(a, b));
    }
}
