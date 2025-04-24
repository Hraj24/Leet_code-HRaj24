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
    public ListNode insertionSortList(ListNode head) {
        if( head == null ){
			return head;
		}
		
		ListNode helper = new ListNode(0); //new starter of the sorted list
		ListNode curr = head; //the node will be inserted
		ListNode pre = helper; //insert node between pre and pre.next
		ListNode next = null; //the next node will be inserted


		//not the end of input list
		while( curr != null ){
			next = curr.next;

			//find the right place to insert
			while( pre.next != null && pre.next.val < curr.val ){
				pre = pre.next;
			}

            
			//insert between pre and pre.next
			curr.next = pre.next;
			pre.next = curr;
			pre = helper;
			curr = next;
		}
		
		return helper.next;
    }
}