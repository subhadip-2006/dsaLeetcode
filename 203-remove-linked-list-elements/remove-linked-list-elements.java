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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ArrayList<ListNode> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            if(temp.val != val) arr.add(temp);
            temp = temp.next;
        }
        for(int i = 0 ; i < arr.size()-1 ; i++){
            arr.get(i).next = arr.get(i+1);
        }
        if(arr.size() != 0) arr.get(arr.size()-1).next = null;
        if(arr.size()==0) return null;
        return arr.get(0);
    }
}