package LinkedList.Medium.Sort_0_1_2_LinkedList;

import java.util.*;
import LinkedList.Node;

public class Better {
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
        int[] count = new int[3];
        Node cur = head;
        while (cur != null) { count[cur.data]++; cur = cur.next; }
        cur = head;
        for (int v = 0; v < 3; v++) {
            while (count[v]-- > 0) {
                cur.data = v;
                cur = cur.next;
            }
        }
        return print(head);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
System.out.println(solve(new int[]{2,1,0,2,1,0}));
    }
}
