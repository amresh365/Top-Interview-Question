/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
    Stack<TreeNode>s1=new Stack<>();
    Stack<TreeNode>s2=new Stack<>();
    
    s1.add(p);
    s2.add(q);

    while(!(s1.isEmpty())&&!(s2.isEmpty()))
    {
     TreeNode curr1=s1.pop();;
     TreeNode curr2=s2.pop();;
        if ((curr1!=null && curr2==null) || (curr1==null && curr2!=null) ) 
        return false;//If Structucture not match return false
        if ((curr1 != null && curr2 != null) && (curr1.val != curr2.val))
        return false;//If value not match return false
        
        if(curr1!=null)
        {
         s1.push(curr1.right);
         s1.push(curr1.left);
        }
    
        if(curr2!=null)
        {
        s2.push(curr2.right);
        s2.push(curr2.left);
        }
    }
     return true;
    }
}