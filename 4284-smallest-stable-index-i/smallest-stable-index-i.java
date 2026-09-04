class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int index=-1;
        for(int i=0;i<n;i++){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<=i;j++){
                max=Math.max(nums[j],max);
            }
            for(int m=i;m<n;m++){
                min=Math.min(nums[m],min);
            }
            if((max-min)<=k){
                index=i;
                break;
            }
        }
        return index;
    }
}