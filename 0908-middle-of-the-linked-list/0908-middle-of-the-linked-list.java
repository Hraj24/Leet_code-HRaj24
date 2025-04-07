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
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode temp = head;
        while(temp != null) {
            n++;
            temp = temp.next;
        }
        int mid = n%2==0 ? (1+n)/2+1 : (1+n)/2;
        temp = head;
        for(int i=1; i<mid; i++) {
            temp = temp.next;
        }
        return temp;
    }
}