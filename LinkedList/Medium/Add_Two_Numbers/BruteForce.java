package LinkedList.Medium.Add_Two_Numbers;

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
        Node l1 = build(new int[]{2,4,3});
        Node l2 = build(new int[]{5,6,4});
        Node dummy = new Node(-1), tail = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) { sum += l1.data; l1 = l1.next; }
            if (l2 != null) { sum += l2.data; l2 = l2.next; }
            tail.next = new Node(sum % 10);
            tail = tail.next;
            carry = sum / 10;
        }
        return print(dummy.next);
    }

    // Time Complexity: O(max(n,m))
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
System.out.println(solve(new int[]{0}));
    }
}
