package Strings.Basic.Largest_Odd_Number_In_A_String;

import java.util.*;

public class Optimal {
    public static String solve(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if (((num.charAt(i) - '0') & 1) == 1) return num.substring(0, i + 1);
        }
        return "";
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) for returned answer
    public static void main(String[] args) {
        System.out.println(solve("52"));
    }
}
