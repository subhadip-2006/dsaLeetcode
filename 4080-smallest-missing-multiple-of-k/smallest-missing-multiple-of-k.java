class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]%k==0) st.add(nums[i]);
        }
        ArrayList<Integer> arr=new ArrayList<>(st);
        Collections.sort(arr);
        int j=1;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)==k*j) j++;
            else return k*j;
        }
        return k*(arr.size()+1);
    }
}