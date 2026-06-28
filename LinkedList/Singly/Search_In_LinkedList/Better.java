package LinkedList.Singly.Search_In_LinkedList;

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
        int target = 7;
        Node cur = head;
        while (cur != null) {
            if (cur.data == target) return "true";
            cur = cur.next;
        }
        return "false";
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
        System.out.println(solve(new int[]{3,4,7,10}));
    }
}
