class Solution {
    public int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int num = gcd(nums[i], nums[j]);

                long mult = (long) nums[i] * nums[j];
                long gcdSquare = (long) num * num;

                max = Math.max(max, mult / gcdSquare);
            }
        }

        return max;
    }
}