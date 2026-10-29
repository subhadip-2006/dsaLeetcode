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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return head;
        ArrayList<Integer> temp1 = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        ListNode temp = head;
        while(temp != null && temp.next != null){
            temp1.add(temp.val);
            temp = temp.next.next;
        }
        if(temp != null) temp1.add(temp.val);
        temp = head.next;
        while(temp != null && temp.next != null){
            temp2.add(temp.val);
            temp = temp.next.next;
        }
        if(temp != null) temp2.add(temp.val);
        temp = head;
        for(int i = 0;i<temp1.size();i++){
            temp.val = temp1.get(i);
            temp = temp.next;
        }
        for(int i = 0;i<temp2.size();i++){
            temp.val = temp2.get(i);
            temp = temp.next;
        }
        return head;
    }
}