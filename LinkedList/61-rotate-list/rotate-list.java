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
 
    public ListNode rotateRight(ListNode head, int k) {
     if (head==null || head.next ==null){
    return head;
    }
    ListNode temp=head;
    ListNode temp2=head;

//In this calculating the length of the list 
      int length=1;
      while(temp.next!=null)
      {
       length++;
       temp=temp.next;
      }
//Here Step temp pointer pointing to last Node & We Create a loop With firstnode And Last Node 
      temp.next=head;

//Here we calculating the minimum Rotation If Value of K Is Greater than size of LinkedList      
      int rotation=length-k%length;

      while(rotation>1)
      {
      temp2=temp2.next;
      rotation--;
      }  
//In This Step we point our head pointer to current temp2 of next & Breaking The loop by assighning temp2 by null
     head=temp2.next;
     temp2.next=null;

     return head;

    }
}


