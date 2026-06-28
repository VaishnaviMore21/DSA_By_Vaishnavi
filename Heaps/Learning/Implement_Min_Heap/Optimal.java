package Heaps.Learning.Implement_Min_Heap;

import java.util.*;

public class Optimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // q
        // add x
        // get
        int q = sc.hasNextInt() ? sc.nextInt() : 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < q; i++) {
            if (!sc.hasNext()) break;
            String op = sc.next();
            if (op.equalsIgnoreCase("add")) {
                int x = sc.hasNextInt() ? sc.nextInt() : 0;
                // Heap push logic
                minHeap.offer(x);
                System.out.println("added=" + x);
            } else if (op.equalsIgnoreCase("get")) {
                System.out.println(minHeap.isEmpty() ? -1 : minHeap.peek());
            } else {
                System.out.println("unknown_op");
            }
        }

        sc.close();
    }
}
