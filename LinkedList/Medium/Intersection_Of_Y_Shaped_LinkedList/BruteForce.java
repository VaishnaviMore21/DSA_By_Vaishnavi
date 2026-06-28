package LinkedList.Medium.Intersection_Of_Y_Shaped_LinkedList;

import java.util.*;
import LinkedList.Node;

public class BruteForce {
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
        Node common = build(new int[]{8,9,10});
        Node a = build(new int[]{1,2,3});
        Node b = build(new int[]{4,5});
        Node ta = a; while (ta.next != null) ta = ta.next; ta.next = common;
        Node tb = b; while (tb.next != null) tb = tb.next; tb.next = common;

        Node p1 = a, p2 = b;
        while (p1 != p2) {
            p1 = (p1 == null) ? b : p1.next;
            p2 = (p2 == null) ? a : p2.next;
        }
        return p1 == null ? "-1" : String.valueOf(p1.data);
    }

    // Time Complexity: O(n+m)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
System.out.println(solve(new int[]{0}));
    }
}
