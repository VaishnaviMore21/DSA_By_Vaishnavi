package LinkedList.Doubly_Medium.Delete_All_Occurrences_Of_Key;

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
        int key = 2;
        DoublyNode cur = head;
        while (cur != null) {
            if (cur.data == key) {
                DoublyNode prev = cur.prev;
                DoublyNode next = cur.next;
                if (prev != null) prev.next = next;
                else head = next;
                if (next != null) next.prev = prev;
            }
            cur = cur.next;
        }
        return print(head);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
System.out.println(solve(new int[]{1,2,3,2,4}));
    }
}
