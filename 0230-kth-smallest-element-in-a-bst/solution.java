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
    public int kthSmallest(TreeNode root, int k) {
      ArrayList<Integer> arr=Inorder(root);
        return arr.get(k-1);
    }

    public ArrayList<Integer> Inorder(TreeNode root){
        ArrayList<Integer> arr=new ArrayList<>();
        
       // int count=0;
       TreeNode node=root;
       if(node==null){
            return arr;
        }
        Stack<TreeNode> st=new Stack<>();
       // st.push(node);
        while(!st.isEmpty() || node!=null){
           // TreeNode node=st.pop();
            if(node!=null){
                st.push(node);
                node=node.left;
            } else{
               node=st.pop();
               arr.add(node.val);
               node=node.right; 
            }
        }
        return arr;
    }
}
