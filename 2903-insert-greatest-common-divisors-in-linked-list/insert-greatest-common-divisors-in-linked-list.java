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
    public int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null){
            int value = gcd(slow.val,fast.val);
            ListNode temp = new ListNode(value);
            slow.next = temp;
            temp.next = fast;
            slow = fast;
            fast = fast.next;
        }
        return head;
    }
}