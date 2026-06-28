package Arrays.Sort_Array_Of_0_1_2;

import java.util.*;

public class Better {
    public static int[] solve(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int value : arr) {
            if (value == 0) count0++;
            else if (value == 1) count1++;
            else count2++;
        }

        int[] out = new int[arr.length];
        int idx = 0;
        while (count0-- > 0) out[idx++] = 0;
        while (count1-- > 0) out[idx++] = 1;
        while (count2-- > 0) out[idx++] = 2;
        return out;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(new int[]{2, 0, 2, 1, 1, 0})));
    }
}
