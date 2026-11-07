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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2 = reverse(head2);
        ListNode i = head;
        ListNode j = head2;
        while(j != null){
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
/*      ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp);
            temp = temp.next;
        }
        int i = 0, j = arr.size()-1;
        while(j >= i){
            if(arr.get(i).val != arr.get(j).val) return false;
            i++;
            j--;
        }
        return true;
*/
    }
}