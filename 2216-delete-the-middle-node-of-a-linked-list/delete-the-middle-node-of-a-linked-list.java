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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = head;
        while(temp.next != slow){
            temp = temp.next;
        }
        temp.next = slow.next;
        return head;
 /*     ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp);
            temp = temp.next;
        }
        int n = arr.size();
        arr.get(n/2-1).next = arr.get(n/2).next;
        return head;
 */
    }
}