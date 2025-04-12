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
        
        ListNode res = head.next;
        ListNode first = head;
        ListNode second = head.next;
        ListNode prev = null;


        while(second!=null){
            
            if(prev!=null)
                prev.next = second;
            first.next = second.next;
            second.next = first;

            prev = first;
            first = prev.next;
            if(null != first)
                second = first.next;
            else
                second = null;    
        }
        return res;
    }
}