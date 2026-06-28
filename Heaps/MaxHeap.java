package Heaps;

import java.util.*;

public class MaxHeap {
    private final List<Integer> heap = new ArrayList<>();

    public void add(int value) {
        heap.add(value);
        siftUp(heap.size() - 1);
    }

    public int peek() {
        return heap.isEmpty() ? -1 : heap.get(0);
    }

    public int poll() {
        if (heap.isEmpty()) return -1;
        int root = heap.get(0);
        int last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            siftDown(0);
        }
        return root;
    }

    private void siftUp(int i) {
        while (i > 0) {
            int p = (i - 1) / 2;
            if (heap.get(p) >= heap.get(i)) break;
            Collections.swap(heap, p, i);
            i = p;
        }
    }

    private void siftDown(int i) {
        int n = heap.size();
        while (true) {
            int l = 2 * i + 1, r = 2 * i + 2, s = i;
            if (l < n && heap.get(l) > heap.get(s)) s = l;
            if (r < n && heap.get(r) > heap.get(s)) s = r;
            if (s == i) break;
            Collections.swap(heap, i, s);
            i = s;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input format:
        // q
        // add x | poll | peek
        int q = sc.hasNextInt() ? sc.nextInt() : 0;
        MaxHeap h = new MaxHeap();
        for (int i = 0; i < q; i++) {
            if (!sc.hasNext()) break;
            String op = sc.next();
            if (op.equalsIgnoreCase("add")) {
                int x = sc.hasNextInt() ? sc.nextInt() : 0;
                h.add(x);
                System.out.println("added=" + x);
            } else if (op.equalsIgnoreCase("poll")) {
                System.out.println("poll=" + h.poll());
            } else if (op.equalsIgnoreCase("peek")) {
                System.out.println("peek=" + h.peek());
            } else {
                System.out.println("unknown_op");
            }
        }
        sc.close();
    }
}
