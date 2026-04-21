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
    Set<Integer> set=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
       
       /* ArrayList<Integer> arr=new ArrayList<>();
        findpreOrder(root,arr);
        if(arr.size()==0){
            return false;
        }
      //  int x=arr.get(0);
        for(int i=0;i<arr.size();i++){
           for(int j=i+1;j<arr.size();j++){
            if(arr.get(i)+arr.get(j)==k){
                return true;
            }
           }
        }
        return false;
    }
    public void findpreOrder(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        findpreOrder(root.left,arr);
        findpreOrder(root.right,arr);
    }
    */

    if(root==null){
        return false;
    }
     int temp=root.val;
     if(set.contains(k-temp)){
        return true;
     }
     set.add(temp);

     return findTarget(root.left,k) || findTarget(root.right,k);

    }
}
