package Heaps.Hard.Find_Median_From_Data_Stream;

import java.util.*;

public class Optimal {
    // Class-based median finder.
    static class MedianFinder {
        private final PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
        private final PriorityQueue<Integer> right = new PriorityQueue<>();

        void addNum(int num) {
            if (left.isEmpty() || num <= left.peek()) left.offer(num);
            else right.offer(num);

            if (left.size() > right.size() + 1) right.offer(left.poll());
            else if (right.size() > left.size()) left.offer(right.poll());
        }

        double findMedian() {
            if (left.isEmpty() && right.isEmpty()) return -1;
            if (left.size() == right.size()) return (left.peek() + right.peek()) / 2.0;
            return left.peek();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // q
        // add x
        // get
        int q = sc.hasNextInt() ? sc.nextInt() : 0;
        MedianFinder mf = new MedianFinder();

        for (int i = 0; i < q; i++) {
            if (!sc.hasNext()) break;
            String op = sc.next();
            if (op.equalsIgnoreCase("add")) {
                int x = sc.hasNextInt() ? sc.nextInt() : 0;
                mf.addNum(x);
                System.out.println("added=" + x);
            } else if (op.equalsIgnoreCase("get")) {
                System.out.println(mf.findMedian());
            } else {
                System.out.println("unknown_op");
            }
        }

        sc.close();
    }
}
