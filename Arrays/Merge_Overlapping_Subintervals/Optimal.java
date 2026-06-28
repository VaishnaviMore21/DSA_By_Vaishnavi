package Arrays.Merge_Overlapping_Subintervals;

import java.util.*;

public class Optimal {
    public static int[][] solve(int[][] intervals) {
        int[][] arr = Arrays.stream(intervals).map(int[]::clone).toArray(int[][]::new);
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        for (int[] in : arr) {
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < in[0]) {
                merged.add(new int[]{in[0], in[1]});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], in[1]);
            }
        }
        return merged.toArray(new int[0][]);
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        int[][] ans = solve(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        for (int[] in : ans) System.out.println(Arrays.toString(in));
    }
}
