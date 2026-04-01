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
    int ans=0;
    public int diameterOfBinaryTree(TreeNode node) {

        dfs(node);
        return ans;
    }
   int dfs(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int lhs=dfs(root.left);
        int rhs=dfs(root.right);


        ans=Math.max(ans,lhs+rhs);
       return 1+Math.max(lhs,rhs);
      // return Math.abs(lhs-rhs);
    }
}
