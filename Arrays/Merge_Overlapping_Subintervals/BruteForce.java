package Arrays.Merge_Overlapping_Subintervals;

import java.util.*;

public class BruteForce {
    public static int[][] solve(int[][] intervals) {
        int[][] arr = Arrays.stream(intervals).map(int[]::clone).toArray(int[][]::new);
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0], end = arr[i][1];
            for (int j = i + 1; j < arr.length && arr[j][0] <= end; j++) {
                end = Math.max(end, arr[j][1]);
                i = j;
            }
            merged.add(new int[]{start, end});
        }
        return merged.toArray(new int[0][]);
    }

    // Time Complexity: O(n log n + n)
    // Space Complexity: O(n)
    public static void main(String[] args) {
        int[][] ans = solve(new int[][]{{1,3},{2,6},{8,10},{15,18}});
        for (int[] in : ans) System.out.println(Arrays.toString(in));
    }
}
