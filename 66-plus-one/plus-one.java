class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int sum = 0;
        int carry = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        digits[n-1] = digits[n-1] + 1;
        for(int i = n-1 ; i >= 0 ; i--){
            sum = digits[i]+carry;
            carry = sum / 10;
            sum = sum % 10;
            arr.add(sum);
        }
        if(carry == 1) arr.add(1);
        int[] answer = new int[arr.size()];
        int i = 0;
        for(int j = arr.size()-1 ; j >= 0 ; j--){
            answer[i] = arr.get(j);
            i++;
        }
        return answer;
    }
}