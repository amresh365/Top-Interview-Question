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
    public int getDecimalValue(ListNode head) {
           int des=0;
          ListNode temp=head;
        while(temp!=null)
        {
          des=des*2;
          des=des+temp.val;
          temp=temp.next;
        }
        return des;
    }
}