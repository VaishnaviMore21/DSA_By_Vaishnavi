package LinkedList.Hard.Reverse_In_K_Group;

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
        Node dummy = new Node(-1, head);
        Node groupPrev = dummy;
        while (true) {
            Node kth = groupPrev;
            for (int i = 0; i < k && kth != null; i++) kth = kth.next;
            if (kth == null) break;
            Node groupNext = kth.next;
            Node prev = groupNext, cur = groupPrev.next;
            while (cur != groupNext) {
                Node nxt = cur.next;
                cur.next = prev;
                prev = cur;
                cur = nxt;
            }
            Node temp = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = temp;
        }
        return print(dummy.next);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
System.out.println(solve(new int[]{1,2,3,4,5}));
    }
}
