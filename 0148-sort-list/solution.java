
 // Definition for singly-linked list.
 /*
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
*/
class Solution {
    public ListNode sortList(ListNode head) {
         if (head == null || head.next == null) return head;

         ListNode temp=head;
         List<Integer> arr=new ArrayList<>();

         while(temp!=null){
           arr.add(temp.val);
           temp=temp.next;
         }
         Collections.sort(arr);
         int i=0;
         ListNode temp1=head;
          while(temp1!=null){
            temp1.val=arr.get(i);
            temp1=temp1.next;
            i++;
         }
         return head;
    }

}
