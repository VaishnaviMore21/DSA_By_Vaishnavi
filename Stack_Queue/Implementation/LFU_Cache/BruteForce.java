package Stack_Queue.Implementation.LFU_Cache;

import java.util.*;

public class BruteForce {
    // Class-based design for LFU cache.
    static class LFUCache {
        private final int capacity;
        private int minFreq;
        private final Map<Integer, Integer> keyToVal = new HashMap<>();
        private final Map<Integer, Integer> keyToFreq = new HashMap<>();
        private final Map<Integer, LinkedHashSet<Integer>> freqToKeys = new HashMap<>();

        LFUCache(int capacity) {
            this.capacity = capacity;
            this.minFreq = 0;
        }

        int get(int key) {
            if (!keyToVal.containsKey(key)) return -1;
            touch(key);
            return keyToVal.get(key);
        }

        void put(int key, int value) {
            if (capacity <= 0) return;
            if (keyToVal.containsKey(key)) {
                keyToVal.put(key, value);
                touch(key);
                return;
            }
            if (keyToVal.size() == capacity) {
                evict();
            }
            keyToVal.put(key, value);
            keyToFreq.put(key, 1);
            freqToKeys.computeIfAbsent(1, k -> new LinkedHashSet<>()).add(key);
            minFreq = 1;
        }

        private void touch(int key) {
            int f = keyToFreq.get(key);
            LinkedHashSet<Integer> keys = freqToKeys.get(f);
            keys.remove(key);
            if (keys.isEmpty()) {
                freqToKeys.remove(f);
                if (minFreq == f) minFreq++;
            }
            int nf = f + 1;
            keyToFreq.put(key, nf);
            freqToKeys.computeIfAbsent(nf, k -> new LinkedHashSet<>()).add(key);
        }

        private void evict() {
            LinkedHashSet<Integer> keys = freqToKeys.get(minFreq);
            int victim = keys.iterator().next();
            keys.remove(victim);
            if (keys.isEmpty()) freqToKeys.remove(minFreq);
            keyToVal.remove(victim);
            keyToFreq.remove(victim);
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

        LFUCache cache = new LFUCache(Math.max(capacity, 1));
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
