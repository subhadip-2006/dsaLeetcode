class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int i=0;
        int j=1;
        for( int ele:nums){
            if(ele>0){
                arr[i]=ele;
                i+=2;
            }
            else{
                arr[j]=ele;
                j+=2;
            }
        }
        return arr;
    }
}