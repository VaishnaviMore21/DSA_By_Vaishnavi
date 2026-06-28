package Stack_Queue.Implementation.LRU_Cache;

import java.util.*;

public class Optimal {
    // Class-based design for cache problem.
    static class LRUCache {
        private final int capacity;
        private final LinkedHashMap<Integer, Integer> map;

        LRUCache(int capacity) {
            this.capacity = capacity;
            this.map = new LinkedHashMap<>(16, 0.75f, true);
        }

        int get(int key) {
            return map.getOrDefault(key, -1);
        }

        void put(int key, int value) {
            if (!map.containsKey(key) && map.size() == capacity) {
                int oldest = map.keySet().iterator().next();
                map.remove(oldest);
            }
            map.put(key, value);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // capacity q
        // q operations:
        // put key value
        // get key
        int capacity = sc.hasNextInt() ? sc.nextInt() : 1;
        int q = sc.hasNextInt() ? sc.nextInt() : 0;

        LRUCache cache = new LRUCache(Math.max(capacity, 1));
        for (int i = 0; i < q; i++) {
            if (!sc.hasNext()) break;
            String op = sc.next();
            if (op.equalsIgnoreCase("put")) {
                int k = sc.hasNextInt() ? sc.nextInt() : 0;
                int v = sc.hasNextInt() ? sc.nextInt() : 0;
                cache.put(k, v);
                System.out.println("put(" + k + "," + v + ")");
            } else if (op.equalsIgnoreCase("get")) {
                int k = sc.hasNextInt() ? sc.nextInt() : 0;
                System.out.println(cache.get(k));
            } else {
                System.out.println("unknown_op");
            }
        }

        sc.close();
    }
}
