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
       int l=0;
      List<Integer> arr=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
      rightSideOfTree(root,l);
      return arr;
    }
    public void rightSideOfTree(TreeNode root,int l) {
        if(root==null){
            return;
        }
        if(l==arr.size()){
           arr.add(root.val);
        }
       rightSideOfTree(root.right,l+1);
       rightSideOfTree(root.left,l+1);
    }
}
