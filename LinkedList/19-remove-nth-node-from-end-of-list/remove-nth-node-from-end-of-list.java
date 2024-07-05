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
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dum=new ListNode(0);
      ListNode dumtemp=dum;

        ListNode fast=head;
        ListNode prev=head;
        if(head.next==null)
        {
            return null;
        }
        for(int i=0;i<n;i++)
        {
          if(fast==null)
          {
              return null;
          }
          fast=fast.next;
        }
     
     while(fast!=null)
     {
      prev=prev.next;
      fast=fast.next;
     }

    ListNode newtemp=head;
    while(newtemp!=null)
    {

     if(newtemp!=prev)
     {  
         ListNode newNode= new ListNode(newtemp.val);
         dumtemp.next=newNode;
         dumtemp=dumtemp.next;
     }
     
     newtemp=newtemp.next;
    }
     return dum.next;
    
    }
}