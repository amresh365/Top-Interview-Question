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
    public ListNode deleteDuplicates(ListNode head) {
      if(head==null)
       {
        return null;
       }
      ListNode dummyHead=new ListNode(0);
      Map<Integer,Integer>map=new HashMap<>();
      ListNode dumTemp=dummyHead;
      ListNode slow=head;
      ListNode fast=head.next; 

      while(slow!=null)
      {
       map.put(slow.val,map.getOrDefault(slow.val,0)+1);  
       slow=slow.next;
      }
      List<Integer>list=new ArrayList<>(map.keySet());
      Collections.sort(list);
      for(int k:list){
          if( map.get(k)==1)
          {
          dumTemp.next=new ListNode(k);
          dumTemp=dumTemp.next;
          } 
        }
     return dummyHead.next;
    }
}