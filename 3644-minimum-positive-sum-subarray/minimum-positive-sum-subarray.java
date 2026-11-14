class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int length = 0;
        int k = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = i ; j < n ; j++){
                sum = sum+nums.get(j);
                if(sum < min && sum > 0){
                    if(j-i+1>=l && j-i+1<=r){
                        min = sum;
                        length = j-i+1;
                    }
                }
            }
        }
        if(length>=l && length<=r) return min;
        return -1;
    }
}