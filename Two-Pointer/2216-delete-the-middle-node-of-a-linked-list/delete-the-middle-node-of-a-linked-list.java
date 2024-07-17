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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        int size=0;
        while(slow!=null)
        {
            slow=slow.next;
            size++;
        }
      if(size==1)
      {
        return null;
      }
      int des=(size/2);
      ListNode curr=head;
      ListNode prev=null;
      int i=0;
      while(i!=des){
       i++;
       prev=curr;
       curr=curr.next;
       if(i==des)
       {
        prev.next=curr.next;
        break;
       }
      }
      
    
        return head;
    }
}