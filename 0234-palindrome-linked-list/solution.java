/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> ns = new Stack<Integer>();
        ListNode t=head;
        ListNode x=head;
        while(t!=null){
           ns.push(t.val);
           t=t.next;
        }

        while(x!=null){
            if(x.val!=ns.pop()){
                return false;
            }
            x=x.next;
           // ns.pop();
        }
        return true;
    }
}
