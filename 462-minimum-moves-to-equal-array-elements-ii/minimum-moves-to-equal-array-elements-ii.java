class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int median = nums[n/2];
        int count = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>median){
                count+=nums[i]-median;
            }
            else{
                count+=median-nums[i];
            }
        }
        return count;
    }
}