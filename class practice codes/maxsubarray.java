class maxsubarray {

    public long maxSubarraySum(int[] nums, int k) {
        long prefix = 0, best = Long.MIN_VALUE;
        long[] minPref = new long[k];
        boolean[] seen = new boolean[k];

        for (int i = 0; i < k; i++) minPref[i] = Long.MAX_VALUE;

        minPref[0] = 0;
        seen[0] = true;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            int mod = (i + 1) % k;

            if (seen[mod]) best = Math.max(best, prefix - minPref[mod]);

            if (!seen[mod]) {
                minPref[mod] = prefix;
                seen[mod] = true;
            } else {
                minPref[mod] = Math.min(minPref[mod], prefix);
            }
        }
        return best;
    }

    public static void main(String[] args) {
        maxsubarray obj = new maxsubarray();

        int[] nums = { -5, 1, 2, -3, 4 };
        int k = 2;

        long ans = obj.maxSubarraySum(nums, k);
        System.out.println(ans);
    }
}
