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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            head=null;
            return head;
        }
        int c=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        System.out.println(c);
        int x=c-n;
        System.out.println(x);
        
        if(x==0){
            ListNode xy=head;
            head=head.next;
            xy=null;
            return head;
        } else if(x+1==c){
            ListNode t=head;
            while(t.next.next!=null){
                t=t.next;
            }
            t.next=null;
            return head;
        }else{
            ListNode te=head;
            int a=1;
            while(a!=x){
                te=te.next;
                a=a+1;
            }
            ListNode xy=te.next;;
            te.next=xy.next;
            return head;

        }

    }
}
