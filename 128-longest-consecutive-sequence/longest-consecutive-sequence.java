class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int n=nums.length;
        int longest=1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int ele:set){
            if(!set.contains(ele-1)){
                int count=1;
                int x=ele;
                while(set.contains(x+1)){
                    x+=1;
                    count+=1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}