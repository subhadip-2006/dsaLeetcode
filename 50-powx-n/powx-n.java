class Solution {
    public double myPow(double x, int n) {
        if(n==0) return 1.0;
        double ans=1.0;
        double call=myPow(x,n/2);
        if(n<0){
            ans=Math.pow(x,n);
            return ans;
        }
        else{
            if(n%2==0){
                ans=call*call;
            }
            else{
                ans=x*call*call;
            }
        }
        return ans;
    }
}