class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int index=-1;
        for(int i=0;i<n;i++){
            int sum=0;
            int num=nums[i];
            while(num!=0){
                int rem=num%10;
                sum+=rem;
                num/=10;
            }
            if(sum==i){
                index=i;
                break;
            }
        }
        return index;
    }
}