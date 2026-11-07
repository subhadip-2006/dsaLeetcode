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
    public ListNode reverse(ListNode head){
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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode i = head;
        ListNode j = head2;
        while(j != null){
            temp.next = i;
            temp = temp.next;
            i = i.next;
            temp.next = j;
            temp = temp.next;
            j = j.next;
        }
        if(i != null){
            temp.next = i;
            temp = temp.next;
        }
    }
}