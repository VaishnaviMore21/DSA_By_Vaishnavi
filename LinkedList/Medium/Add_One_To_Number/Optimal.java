package LinkedList.Medium.Add_One_To_Number;

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
        Node rev = reverse(head);
        int carry = 1;
        Node cur = rev, prev = null;
        while (cur != null && carry > 0) {
            int sum = cur.data + carry;
            cur.data = sum % 10;
            carry = sum / 10;
            prev = cur;
            cur = cur.next;
        }
        if (carry > 0) prev.next = new Node(carry);
        return print(reverse(rev));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
System.out.println(solve(new int[]{1,2,9}));
    }
}
