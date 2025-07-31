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
    public int maxDepth(TreeNode root) {
     int hl,hr;
     if(root==null){
        return 0;
     }
     hl=maxDepth(root.left);
     hr=maxDepth(root.right);
     if(hl>hr)
     return hl+1;
     else
     return hr+1;
     }
    }