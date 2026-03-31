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
        return dfsHeight(root)!=-1; 
    }

    int dfsHeight(TreeNode node){
        if (node==null){
            return 0;
        }
        int lefh=dfsHeight(node.left);
        if(lefh==-1){
            return -1;
        }
        int reh=dfsHeight(node.right);
        if(reh==-1){
            return -1;
        }
        if(Math.abs(lefh-reh)>1){
            return -1;
        }
        return 1+Math.max(lefh,reh);
    }
}
