/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp1 = head;
        ListNode temp2 = head;
        for(int i=1;i<left;i++){
            temp1 = temp1.next;
        }
        ListNode t = temp1;
        for(int i=1;i<right;i++){
            temp2 = temp2.next;
        }
        while(temp1 != temp2.next){
            arr.add(temp1.val);
            temp1 = temp1.next;
        }
        temp1 = t;
        for(int i=arr.size()-1;i>=0;i--){
            temp1.val = arr.get(i);
            temp1 = temp1.next;
        }
        return head;
    }
}