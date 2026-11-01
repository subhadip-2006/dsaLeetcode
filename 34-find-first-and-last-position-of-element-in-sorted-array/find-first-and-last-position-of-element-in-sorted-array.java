class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lo = 0 ;
        int hi = n - 1 ;
        int fidx = -1 ;
        int lidx = -1 ;
        while(lo <= hi){
            int mid =(lo + hi)/2;
            if(target< nums[mid]){
               
                hi = mid - 1;
            }
            else if(target > nums[mid]){
                 lo = mid + 1;
            }
            else if(target == nums[mid]){
                fidx = mid ;
                hi = mid - 1;
            }
        }
        lo = 0 ;
        hi = n - 1 ;
        while(lo <= hi){
            int mid =(lo + hi)/2;
            if(target< nums[mid]){
                hi = mid - 1;
            }
            else if(target > nums[mid]){
               
                lo = mid + 1;
            }
            else if(target == nums[mid]){
                lidx = mid ;
                lo = mid + 1;
            }
        }
        return new int[]{fidx, lidx};
    }
}