package LinkedList.Medium.Reverse_LinkedList_Recursive;

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

    private static Node reverse(Node head) {
        if (head == null || head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static String solve(int[] values) {
        Node head = build(values);
        Node rev = reverse(head);
        return print(rev);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) recursion stack
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,3,4}));
    }
}
