package Heaps.Hard.Design_Twitter;

import java.util.*;

public class BruteForce {
    // Class-based design as requested.
    static class Twitter {
        private static class Tweet {
            int id, time;
            Tweet(int id, int time) { this.id = id; this.time = time; }
        }

        private int timer = 0;
        private final Map<Integer, Set<Integer>> follows = new HashMap<>();
        private final Map<Integer, List<Tweet>> tweets = new HashMap<>();

        public void postTweet(int userId, int tweetId) {
            follows.computeIfAbsent(userId, k -> new HashSet<>()).add(userId);
            tweets.computeIfAbsent(userId, k -> new ArrayList<>()).add(new Tweet(tweetId, timer++));
        }

        public List<Integer> getNewsFeed(int userId) {
            follows.computeIfAbsent(userId, k -> new HashSet<>()).add(userId);
            PriorityQueue<Tweet> pq = new PriorityQueue<>((a, b) -> b.time - a.time);
            for (int u : follows.get(userId)) {
                List<Tweet> t = tweets.getOrDefault(u, Collections.emptyList());
                pq.addAll(t);
            }
            List<Integer> out = new ArrayList<>();
            for (int i = 0; i < 10 && !pq.isEmpty(); i++) out.add(pq.poll().id);
            return out;
        }

        public void follow(int followerId, int followeeId) {
            follows.computeIfAbsent(followerId, k -> new HashSet<>()).add(followerId);
            follows.get(followerId).add(followeeId);
        }

        public void unfollow(int followerId, int followeeId) {
            if (followerId == followeeId) return;
            follows.getOrDefault(followerId, new HashSet<>()).remove(followeeId);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input format:
        // q
        // post userId tweetId
        // feed userId
        // follow a b
        // unfollow a b
        int q = sc.hasNextInt() ? sc.nextInt() : 0;
        Twitter twitter = new Twitter();

        for (int i = 0; i < q; i++) {
            if (!sc.hasNext()) break;
            String op = sc.next();
            if (op.equalsIgnoreCase("post")) {
                int u = sc.hasNextInt() ? sc.nextInt() : 0;
                int t = sc.hasNextInt() ? sc.nextInt() : 0;
                twitter.postTweet(u, t);
                System.out.println("posted");
            } else if (op.equalsIgnoreCase("feed")) {
                int u = sc.hasNextInt() ? sc.nextInt() : 0;
                System.out.println(twitter.getNewsFeed(u));
            } else if (op.equalsIgnoreCase("follow")) {
                int a = sc.hasNextInt() ? sc.nextInt() : 0;
                int b = sc.hasNextInt() ? sc.nextInt() : 0;
                twitter.follow(a, b);
                System.out.println("ok");
            } else if (op.equalsIgnoreCase("unfollow")) {
                int a = sc.hasNextInt() ? sc.nextInt() : 0;
                int b = sc.hasNextInt() ? sc.nextInt() : 0;
                twitter.unfollow(a, b);
                System.out.println("ok");
            } else {
                System.out.println("unknown_op");
            }
        }

        sc.close();
    }
}
