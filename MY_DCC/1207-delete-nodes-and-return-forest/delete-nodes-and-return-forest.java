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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {  
        List<TreeNode> result = new ArrayList<>();  
        Set<Integer> toDeleteSet = new HashSet<>();  
        for (int val : to_delete) {  
            toDeleteSet.add(val);  
        }  
        
        traverse(root, toDeleteSet, result, true);  
        
        return result;  
    }  
    
    private TreeNode traverse(TreeNode node, Set<Integer> toDeleteSet,List<TreeNode> result, boolean isRoot) {  
        if (node == null) {  
            return null;  
        }  
        
        boolean deleted = toDeleteSet.contains(node.val);  
        if (isRoot && !deleted) {  
            result.add(node);  
        }  
        
        node.left = traverse(node.left, toDeleteSet, result, deleted);  
        node.right = traverse(node.right, toDeleteSet, result, deleted);  
        
        return deleted ? null : node;  
    }  
}


//   list.add(currentNode.value);
//    if(currentNode.left==null) {
//     	  list.add(null);
//       }
//       if(currentNode.right==null) {
//     	  list.add(null);
//       }