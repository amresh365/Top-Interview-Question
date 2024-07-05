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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int ans[]={-1,-1};
          if(head==null)
        {
            return ans;
        }
        List<Integer>cPoint=new ArrayList<>();
        ListNode curr=head.next;
        ListNode prev=head;
        ListNode nex=head.next.next;
        int count=2;

        while(nex!=null)
        {
           if(curr.val<prev.val&&curr.val<nex.val)
           {
            cPoint.add(count);
           }
          else if(curr.val>prev.val&&curr.val>nex.val)
           {
            cPoint.add(count);
           }
            prev=curr;
            curr=nex;
            nex=nex.next;
            count++;
        }

      int minDistance=Integer.MAX_VALUE;

      for(int i=0;i<cPoint.size()-1;i++)
      {
      if(cPoint.get(i+1)-cPoint.get(i)<minDistance)
      {
      minDistance=cPoint.get(i+1)-cPoint.get(i);
      }
    
      }
        if(cPoint.size()>=2){
        ans[0]=minDistance;
        ans[1]=cPoint.get(cPoint.size()-1)-cPoint.get(0);
        }

        return ans;
    }
}