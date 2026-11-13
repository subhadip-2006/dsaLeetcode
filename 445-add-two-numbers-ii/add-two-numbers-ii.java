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
    public ListNode reverse(ListNode head) {
        if(head == null) return head;
        ListNode p = null;
        ListNode c = head;
        while(c != null){
            ListNode f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
        return p;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverse(l1);
        ListNode head2 = reverse(l2);
        int carry = 0;
        int sum = 0;
        ListNode t1 = head1;
        ListNode t2 = head2;
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
        ListNode d1 = reverse(d.next);
        return d1;
    }
}