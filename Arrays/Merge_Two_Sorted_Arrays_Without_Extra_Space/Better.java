package Arrays.Merge_Two_Sorted_Arrays_Without_Extra_Space;

import java.util.*;

public class Better {
    public static String solve(int[] a, int[] b) {
        int left = a.length - 1;
        int right = 0;

        // Push larger a[] elements to b[] side.
        while (left >= 0 && right < b.length && a[left] > b[right]) {
            int temp = a[left];
            a[left] = b[right];
            b[right] = temp;
            left--;
            right++;
        }

        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.toString(a) + " | " + Arrays.toString(b);
    }

    // Time Complexity: O(min(n,m) + n log n + m log m)
    // Space Complexity: O(1)
    public static void main(String[] args) {
        int[] a = {1, 4, 8, 10};
        int[] b = {2, 3, 9};
        System.out.println(solve(a, b));
    }
}
