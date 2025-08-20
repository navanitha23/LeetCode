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
    public int maxLevelSum(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue <TreeNode> q=new ArrayDeque<>();
        int res=root.val;
        int maxl=1;
        int currl=1;
        q.add(root);
        while(!q.isEmpty()){
              int c=q.size();
              int sum=0;
              while(c-->0){
                TreeNode temp=q.poll();
                sum=sum+temp.val;
                if(temp.left!=null)
                q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
              }
              if(sum>res){
                res=sum;
                maxl=currl;
              }
            currl++;
        }
        return maxl;
    }
}