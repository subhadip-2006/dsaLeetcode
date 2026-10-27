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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        int n = 0;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        k = k%n;
        if(k==0) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i=1;i<=k+1;i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        temp = slow.next;
        fast = temp;
        while(fast.next!=null){
            fast = fast.next;
        }
        fast.next = head;
        slow.next = null;
        return temp;
    }
}