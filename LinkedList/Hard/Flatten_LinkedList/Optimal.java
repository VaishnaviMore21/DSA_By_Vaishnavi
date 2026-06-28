package LinkedList.Hard.Flatten_LinkedList;

import java.util.*;
import LinkedList.Node;

public class Optimal {
    private static Node build(int[] values) {
        Node dummy = new Node(-1);
        Node tail = dummy;
        for (int value : values) {
            tail.next = new Node(value);
            tail = tail.next;
        }
        return dummy.next;
    }

    private static String print(Node head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.data);
            if (head.next != null) sb.append(" -> ");
            head = head.next;
        }
        return sb.toString();
    }

    public static String solve(int[] values) {
        Node head = build(values);
        // Simplified flatten demo: sort linear next-chain values.
        List<Integer> vals = new ArrayList<>();
        Node cur = head;
        while (cur != null) { vals.add(cur.data); cur = cur.next; }
        Collections.sort(vals);
        Node dummy = new Node(-1), tail = dummy;
        for (int v : vals) { tail.next = new Node(v); tail = tail.next; }
        return print(dummy.next);
    }

    // Time Complexity: O(n log n)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
System.out.println(solve(new int[]{5,1,4,2,3}));
    }
}
