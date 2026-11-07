class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=1;
        for(int i=0;i<n;i++){
               if(nums[i]<count) continue;
               if(nums[i]==count) count++;
            }
        return count;
    }
}