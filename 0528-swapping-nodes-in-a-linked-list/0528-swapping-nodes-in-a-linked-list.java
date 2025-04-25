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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode start=head;
        ListNode end=head;

        int count =0;
        
        while(temp!=null){
            temp=temp.next;
            count++;
        }
         // Find Start
        for(int i=1;i<k;i++){
            start = start.next;
        }
         // Find End
        for(int i = 1; i < count - k + 1; i++) {
            end = end.next;
        }
        // Swap the Start and End
        int tempVal = start.val;
        start.val = end.val;
        end.val=tempVal;

        return head;
    }
}