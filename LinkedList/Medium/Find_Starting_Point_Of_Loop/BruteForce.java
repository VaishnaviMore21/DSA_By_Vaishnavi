package LinkedList.Medium.Find_Starting_Point_Of_Loop;

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
        if (head == null || head.next == null) return "-1";
        Node tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = head.next; // loop at second node for demo

        Node slow = head, fast = head;
        boolean found = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { found = true; break; }
        }
        if (!found) return "-1";
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return String.valueOf(slow.data);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
System.out.println(solve(new int[]{10,20,30,40}));
    }
}
