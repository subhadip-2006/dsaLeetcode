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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = dummy;
        while(a != null && b != null){
            c.next = b;
            a.next = b.next;
            b.next = a;
            c = a;
            a = a.next;
            if(a!=null) b = a.next;
        }
        return dummy.next;
/*      ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;
        while(even != null && even.next != null){
            odd.next = odd.next.next;
            odd = odd.next;
            even.next = even.next.next;
            even = even.next;
        }
        odd.next = null;
        ListNode temp1 = head;
        ListNode temp2 = evenHead;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(temp1 != null && temp2 != null){
            temp.next = temp2;
            temp = temp.next;
            temp2 = temp2.next;
            temp.next = temp1;
            temp = temp.next;
            temp1 = temp1.next;
        }
        return dummy.next;
*/
    }
}