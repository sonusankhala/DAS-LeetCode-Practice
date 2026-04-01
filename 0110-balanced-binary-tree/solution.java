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
    public boolean isBalanced(TreeNode root) {

        return treeheight(root)!=-1;
        
    }

    public int treeheight(TreeNode node){
        if(node==null){
            return 0;
        }
        int lhs=treeheight(node.left);
        if(lhs==-1){
            return -1;
        }
        int rhs=treeheight(node.right);
        
        if(rhs==-1){
             return -1;
        }
        if(Math.abs(lhs-rhs)>1){
            return -1;
        }
        return 1+Math.max(lhs,rhs);
    }
}
