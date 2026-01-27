import java.util.*;

class Solution {
    public int minCost(int n, int[][] edges) {
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int start = edge[0];
            int end = edge[1];
            int weight = edge[2];

            graph.get(start).add(new int[]{end, weight});
            graph.get(end).add(new int[]{start, 2 * weight});
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        boolean[] visit = new boolean[n];

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[1], b[1])
        );

        pq.add(new int[]{0, 0});

        while (!pq.isEmpty()) {
            int[] top = pq.poll();
            int node = top[0];
            int dis = top[1];

            if (node == n - 1) {
                return dis;
            }

            if (visit[node]) continue;
            visit[node] = true;

            for (int[] next : graph.get(node)) {
                int node1 = next[0];
                int cost = next[1];

                if (!visit[node1] &&
                    dis + cost < dist[node1]) {

                    dist[node1] = dis + cost;
                    pq.add(new int[]{node1, dist[node1]});
                }
            }
        }

        return -1;
    }
}