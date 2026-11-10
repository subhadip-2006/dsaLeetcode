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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode d = dummy;
        while(t1 != null || t2 != null){
            ListNode temp = new ListNode();
            if(t1 != null && t2 == null){
                sum = t1.val + 0 + carry;
                if(sum>9){
                    sum%=10;
                    carry = 1;
                }
                else carry = 0;
                t1 = t1.next;
                temp.val = sum;
                dummy.next = temp;
                dummy = dummy.next;
            }
            else if(t2 != null && t1 == null){
                sum = 0 + t2.val + carry;
                if(sum>9){
                    sum%=10;
                    carry = 1;
                }
                else carry = 0;
                t2 = t2.next;
                temp.val = sum;
                dummy.next = temp;
                dummy = dummy.next;
            }
            else{
                sum = t1.val + t2.val + carry;
                if(sum>9){
                    sum%=10;
                    carry = 1;
                }
                else carry = 0;
                t1 = t1.next;
                t2 = t2.next;
                temp.val = sum;
                dummy.next = temp;
                dummy = dummy.next;
            }
        }
        if(carry==1){
            ListNode temp = new ListNode(1);
            dummy.next = temp;
            dummy = dummy.next;
        }
        return d.next;
    }
}