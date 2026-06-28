package Binary_Trees.Hard.Root_To_Leaf_Path;

import java.util.*;
import Binary_Trees.TreeNode;

public class Better {
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

    private static List<Integer> solve(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        // TODO: Implement problem-specific traversal.
        // Placeholder: simple preorder traversal.
        preorder(root, out);
        return out;
    }

    private static void preorder(TreeNode node, List<Integer> out) {
        if (node == null) return;
        out.add(node.val);
        preorder(node.left, out);
        preorder(node.right, out);
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
