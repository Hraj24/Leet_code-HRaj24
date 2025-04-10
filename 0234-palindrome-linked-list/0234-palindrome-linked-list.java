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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        //step-1:Find Mid
           ListNode midNode=findMid(head);

        //step-2:Reverse 2nd half
           ListNode prev=null;
           ListNode curr=midNode;
           ListNode next;

           while(curr != null){
              next=curr.next;
              curr.next=prev;
              prev=curr;
              curr=next;
           }



           ListNode right=prev;   //Right half head
           ListNode left=head;    //Left half head

        //step-3:Check Left Half and Second half
           while(right != null){
            if(left.val != right.val){
                return false;
            }
            left=left.next;
            right=right.next;
           }

           return true;
    }
    public ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;  //+2
            slow=slow.next;       //+1
        }
       return slow;
    }
}