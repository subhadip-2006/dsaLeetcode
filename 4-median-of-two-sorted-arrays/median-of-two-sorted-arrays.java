class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int s=m+n-1;
        int[] arr=new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        int j=0;
        for(int i=m;i<m+n;i++){
            arr[i]=nums2[j];
            j++;
        }
        Arrays.sort(arr);
        int lo=0,hi=m+n-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(s%2==0) return (double)arr[mid];
            else return (arr[mid]+arr[mid+1])/(double)2;
        }
        if(s==0) return arr[0];
        return 0;
    }
}