package Binary_Trees.Hard.Lowest_Common_Ancestor;

import java.util.*;
import Binary_Trees.TreeNode;

public class BruteForce {
    private static TreeNode buildTreeLevelOrder(int n, int[] values) {
        if (n == 0 || values.length == 0 || values[0] == -1) return null;

        TreeNode root = new TreeNode(values[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        int i = 1;
        while (!queue.isEmpty() && i < n) {
            TreeNode current = queue.poll();

            if (i < n && values[i] != -1) {
                current.left = new TreeNode(values[i]);
                queue.offer(current.left);
            }
            i++;

            if (i < n && values[i] != -1) {
                current.right = new TreeNode(values[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    private static int solve(TreeNode root) {
        // TODO: Implement integer-returning tree logic.
        // Placeholder: count nodes.
        return count(root);
    }

    private static int count(TreeNode node) {
        if (node == null) return 0;
        return 1 + count(node.left) + count(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // n
        // n integers in level-order where -1 means null
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int[] values = new int[Math.max(0, n)];
        for (int i = 0; i < n; i++) {
            values[i] = sc.hasNextInt() ? sc.nextInt() : -1;
        }

        TreeNode root = buildTreeLevelOrder(n, values);
        System.out.println("Result: " + solve(root));

        sc.close();
    }
}
