package LinkedList.Singly.Find_Length;

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
        int len = 0;
        Node cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return String.valueOf(len);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5,6,7,8,9}));
    }
}
