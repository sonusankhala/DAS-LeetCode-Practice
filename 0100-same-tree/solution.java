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
   /* public boolean isSameTree(TreeNode p, TreeNode q) {
           Stack<TreeNode> sp=new Stack<>();
           Stack<TreeNode> sq=new Stack<>();
           ArrayList<Integer> arr=new ArrayList<>();
            if(p==null || q==null){
                return false;
            }
           if(p.val!=q.val){
            return false;
           }

          // boolean ans=true;
           TreeNode temp1=p;
           TreeNode temp2=q;
           sp.push(temp1);
           sq.push(temp2);
           while((temp1 !=null & temp2!=null) || (!sp.isEmpty() && !sq.isEmpty())){
            if(temp1 !=null && temp2!=null){
                if(temp1.val!=temp2.val){
                    return false;
                }
                temp1=temp1.left;
                temp2=temp2.left;
                 sp.push(temp1);
                 sq.push(temp2);
            }
            else{
                temp1=sp.pop();
                temp2=sq.pop();
                if(temp1==null || temp2==null || temp1.val!=temp2.val){
                    return false;
                }
                sp.push(temp1.right);
                sq.push(temp2.right);
            }
           }

        return true;
    } */
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null || p.val!=q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right, q.right);
     }

   // public boolean ()
}
