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
      ListNode dummy1=new ListNode(0);
      ListNode dummy2=new ListNode(0);
      ListNode tmpD1=dummy1,tmpD2=dummy2;;
      ListNode tmp=head;
      int i=1;
      while(tmp!=null)
      {
       if(i%2!=0)
       {
        tmpD1.next=new ListNode(tmp.val);
        tmpD1=tmpD1.next; 
       }else{
        tmpD2.next=new ListNode(tmp.val);
        tmpD2=tmpD2.next;
       }
       tmp=tmp.next;
       i++;
      }
      tmpD1.next=dummy2.next;

     return dummy1.next;
    }
}