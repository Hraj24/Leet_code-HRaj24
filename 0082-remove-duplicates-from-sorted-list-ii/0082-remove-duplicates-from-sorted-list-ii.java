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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preSlow = dummy;
        ListNode slow = head;

        while (slow != null) {
            ListNode fast = slow.next;
            
            if (fast != null && slow.val == fast.val) {
                while (fast != null && slow.val == fast.val) {
                    fast = fast.next;
                }
                preSlow.next = fast;
                slow = fast;
            } else {
                preSlow = slow;
                slow = slow.next;
            }
        }
        
        return dummy.next;
    }
}