class Solution {
    public int[][] kClosest(int[][] points, int k) {
         PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(dist(b), dist(a))
        );

        for (int[] p : points) {
            pq.offer(p);
            if (pq.size() > k) pq.poll(); // evict the farthest
        }

        int[][] res = new int[k][];
        for (int i = 0; i < k; i++) res[i] = pq.poll();
        return res;
    }

    private int dist(int[] p) {
        return p[0] * p[0] + p[1] * p[1];
    }
}