package Heaps.Medium.Merge_K_Sorted_Lists;

import java.util.*;

public class BruteForce {
    private static List<Integer> solve(List<List<Integer>> lists) {
        // TODO: Implement Merge_K_Sorted_Lists with PriorityQueue.
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (List<Integer> list : lists) {
            for (int x : list) pq.offer(x);
        }
        List<Integer> merged = new ArrayList<>();
        while (!pq.isEmpty()) merged.add(pq.poll());
        return merged;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // k
        // for each list: size then elements
        int k = sc.hasNextInt() ? sc.nextInt() : 0;
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int sz = sc.hasNextInt() ? sc.nextInt() : 0;
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < sz; j++) {
                if (sc.hasNextInt()) list.add(sc.nextInt());
            }
            lists.add(list);
        }

        System.out.println("Result: " + solve(lists));
        sc.close();
    }
}
