package LinkedList.Hard.Rotate_LinkedList;

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
        int k = 2;
        if (head == null || head.next == null) return print(head);
        int len = 1;
        Node tail = head;
        while (tail.next != null) { tail = tail.next; len++; }
        k %= len;
        if (k == 0) return print(head);
        tail.next = head;
        int stepsToNewTail = len - k - 1;
        Node newTail = head;
        for (int i = 0; i < stepsToNewTail; i++) newTail = newTail.next;
        Node newHead = newTail.next;
        newTail.next = null;
        return print(newHead);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
System.out.println(solve(new int[]{1,2,3,4,5}));
    }
}
