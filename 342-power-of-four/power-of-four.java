class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == Integer.MAX_VALUE) return false;
        int power = 0;
        int i = 0;
        while(power < n){
            power = (int)Math.pow(4 , i);
            i++;
            if(power == n) return true;
        }
        return false;
    }
}