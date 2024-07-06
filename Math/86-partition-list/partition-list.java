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
    public ListNode partition(ListNode head, int x) {
        // Creating Two Dummy Nodes 
        ListNode small=new ListNode(0);
        ListNode high=new ListNode(0);
        
        ListNode lowestHead=small;
        ListNode highestHead=high;
        // Inserting small value in small list And inserting Greater Value In high List 
        while(head!=null)
        {
            if(head.val<x)
            {
                lowestHead.next=head;
                lowestHead=lowestHead.next;
            }
            else
            {
                highestHead.next=head;
                highestHead=highestHead.next;
            }
            head=head.next;
        }
        //In this step We Combining small And High list
        highestHead.next=null;
        lowestHead.next=high.next;
        return small.next; 
    }
}