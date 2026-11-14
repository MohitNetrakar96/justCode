class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        int min = Integer.MAX_VALUE;
        for (int len = l; len <= r && len <= n; len++) {
            for (int i = 0; i + len <= n; i++) {
                int sum = prefix[i + len] - prefix[i];
                if (sum > 0 && sum < min) {
                    min = sum;
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}