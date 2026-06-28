package Stack_Queue.Learning.Implement_Stack_Using_Queue;

import java.util.*;

public class Optimal {
    private static List<String> solve(int q, Scanner sc) {
        Deque<Integer> stack = new ArrayDeque<>();
        Queue<Integer> queue = new ArrayDeque<>();
        List<String> out = new ArrayList<>();

        // Operation format examples:
        // push 10
        // pop
        // enqueue 20
        // dequeue
        for (int i = 0; i < q; i++) {
            if (!sc.hasNext()) break;
            String op = sc.next();

            if (op.equalsIgnoreCase("push")) {
                if (sc.hasNextInt()) {
                    int x = sc.nextInt();
                    // Push logic
                    stack.push(x);
                    out.add("pushed=" + x);
                }
            } else if (op.equalsIgnoreCase("pop")) {
                // Pop logic with edge-case handling
                out.add(stack.isEmpty() ? "pop=-1" : "pop=" + stack.pop());
            } else if (op.equalsIgnoreCase("enqueue")) {
                if (sc.hasNextInt()) {
                    int x = sc.nextInt();
                    // Enqueue logic
                    queue.offer(x);
                    out.add("enqueued=" + x);
                }
            } else if (op.equalsIgnoreCase("dequeue")) {
                // Dequeue logic with edge-case handling
                out.add(queue.isEmpty() ? "dequeue=-1" : "dequeue=" + queue.poll());
            } else {
                out.add("unknown_op=" + op);
            }
        }

        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // q
        // q operations line-by-line/tokens
        int q = sc.hasNextInt() ? sc.nextInt() : 0;
        List<String> ans = solve(q, sc);

        for (String line : ans) {
            System.out.println(line);
        }

        sc.close();
    }
}
