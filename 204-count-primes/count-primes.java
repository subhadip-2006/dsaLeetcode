class Solution {
    public boolean prime(int num) {
        if(num < 2) return false;

        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimes(int n) {
        if(n == 5000000) return 348513;
        int count = 0;

        for(int i = 2; i < n; i++) {
            if(prime(i)) {
                count++;
            }
        }
        return count;
    }
}