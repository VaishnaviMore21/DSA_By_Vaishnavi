package Strings.Medium.Reverse_Every_Word_In_A_String;

import java.util.*;

public class Optimal {
    public static String solve(String s) {
        char[] arr = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {
            if (i == arr.length || arr[i] == ' ') {
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }
        return new String(arr);
    }

    private static void reverse(char[] arr, int l, int r) {
        while (l < r) {
            char t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) due to char array copy from string
    public static void main(String[] args) {
        System.out.println(solve("Reverse every word"));
    }
}
