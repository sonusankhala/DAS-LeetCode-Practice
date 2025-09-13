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
    public ListNode middleNode(ListNode head) {

      if(head==null || head.next==null){
        return head;
      }

      int c=0;
      ListNode t=head;
      while(t!=null){
        c++;
        t=t.next;
      }

      
      
    int mid=(c/2)+1;
   
   ListNode temp=head;
   int z=1;
while(temp!=null){
      if(z==mid){
        break;
      }
      z++;
      temp=temp.next;
        
    }

     return temp;
}
}
