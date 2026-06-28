package LinkedList.Doubly_Medium.Find_Pairs_With_Given_Sum;

import java.util.*;
import LinkedList.DoublyNode;

public class BruteForce {
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
        int target = 7;
        List<String> pairs = new ArrayList<>();
        DoublyNode left = head, right = head;
        while (right.next != null) right = right.next;
        while (left != null && right != null && left != right && right.next != left) {
            int sum = left.data + right.data;
            if (sum == target) {
                pairs.add("(" + left.data + "," + right.data + ")");
                left = left.next;
                right = right.prev;
            } else if (sum < target) left = left.next;
            else right = right.prev;
        }
        return pairs.toString();
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1) extra unless noted in approach logic
    public static void main(String[] args) {
System.out.println(solve(new int[]{1,2,3,4,5,6}));
    }
}
