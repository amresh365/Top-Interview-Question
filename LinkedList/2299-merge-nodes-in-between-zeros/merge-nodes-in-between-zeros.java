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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummyHead=new ListNode(0);
        ListNode curr = dummyHead;
        ListNode left=head;
        ListNode right=head.next;
        int sum=0;
        while(left!=null&&right!=null)
        { 
         if(left.val==0)
         {
          while(right.val!=0)
          {
           sum+=right.val;
           right=right.next;
          }
          curr.next=new ListNode(sum);
          curr=curr.next;
          right=right.next;
          sum=0;
         }
         left=left.next;
        }
        return dummyHead.next;
    }
}