package LinkedList.Doubly.Introduction_To_Doubly_LinkedList;

import java.util.*;
import LinkedList.DoublyNode;

public class Better {
    private static DoublyNode build(int[] values) {
        DoublyNode head = null, prev = null;
        for (int value : values) {
            DoublyNode node = new DoublyNode(value);
            if (head == null) head = node;
            node.prev = prev;
            if (prev != null) prev.next = node;
            prev = node;
        }
        return head;
    }

    private static String print(DoublyNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.data);
            if (head.next != null) sb.append(" <-> ");
            head = head.next;
        }
        return sb.toString();
    }

    public static String solve(int[] values) {
        DoublyNode head = build(values);
        return print(head);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,3}));
    }
}
