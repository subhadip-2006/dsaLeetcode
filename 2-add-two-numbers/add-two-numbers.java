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
            int x = (t1 != null) ? t1.val : 0;
            int y = (t2 != null) ? t2.val : 0;
            sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            if(t1 != null) t1 = t1.next;
            if(t2 != null) t2 = t2.next;
            temp.val = sum;
            dummy.next = temp;
            dummy = dummy.next;
        }
        if(carry==1){
            ListNode temp = new ListNode(1);
            dummy.next = temp;
            dummy = dummy.next;
        }
        return d.next;
    }
}