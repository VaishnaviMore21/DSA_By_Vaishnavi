package Stack_Queue.Conversion.Infix_To_Prefix;

import java.util.*;

public class BruteForce {
    private static String solve(String s) {
        // TODO: Implement Infix_To_Prefix logic for this approach.
        // Placeholder echoes trimmed input.
        return s == null ? "" : s.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // Entire line string
        String s = sc.hasNextLine() ? sc.nextLine() : "";

        String ans = solve(s);
        System.out.println("Result: " + ans);

        sc.close();
    }
}
