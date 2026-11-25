class Solution {
    public boolean isPowerOfFour(int n) {
        long power = 1;
        int i = 0;

        while (power <= n) {
            power = (long)Math.pow(4, i);
            i++;

            if (power == n) return true;
        }
        return false;
    }
}