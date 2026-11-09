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
    public void reverse(ListNode head) {
     if(head == null) return;
        ListNode p = null;
        ListNode c = head;
        while(c != null){
            ListNode f = c.next;
            c.next = p;
            p = c;
            c = f;
        }
    }
    public ListNode reverseBetween(ListNode head, int l, int r) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        dummy.next = head;
        ListNode tail1 = null;
        ListNode tail2 = null;
        ListNode head2 = null;
        ListNode head3 = null;
        for(int i=1;i<l;i++){
            temp = temp.next;
        }
        tail1 = temp;
        head2 = temp.next;
        for(int i=l;i<=r;i++){
            temp = temp.next;
        }
        tail2 = temp;
        head3 = temp.next;
        tail1.next = null;
        tail2.next = null;
        reverse(head2);
        tail1.next = tail2;
        head2.next = head3;
        return dummy.next;
/*      ArrayList<Integer> arr = new ArrayList<>();
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
*/
    }
}