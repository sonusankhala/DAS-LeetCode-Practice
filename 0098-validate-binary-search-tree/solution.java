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
    public boolean isValidBST(TreeNode root) {


if(root==null){
    return true;
}
        ArrayList<Integer> arr=new ArrayList<>(); 
        Inorder(root,arr);
        boolean ans=true;
        for(int i=0;i<arr.size()-1;i++){
           if(arr.get(i)>=arr.get(i+1)){
            ans=false;
            break;
           }
        }

        return ans;
        
    }
   void Inorder(TreeNode root,ArrayList<Integer> arr){
       // ArrayList<Integer> arr=new ArrayList<>();
        if(root==null){
            return;
        }
        Inorder(root.left,arr);
        arr.add(root.val);
        Inorder(root.right,arr);
        
    }
}
