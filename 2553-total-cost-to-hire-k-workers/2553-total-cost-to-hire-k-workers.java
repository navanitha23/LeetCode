class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int left=0;
        int right=costs.length-1;
           PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> (costs[a] - costs[b] != 0 ? costs[a] - costs[b] : a - b));
        for (int i = 0; i < candidates && left <= right; i++) {
            p.add(left++);
            if (left <= right) p.add(right--);
        }

        long res = 0;
        while (k > 0) {
            int idx = p.poll();
            if (left <= right && left < costs.length && right >= 0) {
                if (idx <= left) p.add(left++);
                else p.add(right--);
            }
            res += costs[idx];
            k--;
        }
        return res;
    }
}