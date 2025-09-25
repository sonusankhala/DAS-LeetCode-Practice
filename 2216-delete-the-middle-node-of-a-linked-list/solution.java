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

static {
        ListNode t = new ListNode(0);
        for (int i = 0; i < 800; i++)
            deleteMiddle(t);
    }

    static public ListNode deleteMiddle(ListNode head) {
/*
        if(head==null || head.next==null){
            head=null;
            return head;
        }
        int n=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            n++;
        }
        int mid=n/2;
        System.out.println("mid "+mid);
        int x=1;
        ListNode de=head;
        while(x!=mid){
            de=de.next;
            x++;
        }
        System.out.println("index "+x);
        ListNode nextNode=de.next.next;
        de.next=nextNode;

        return head;
        */

        if(head.next==null){
            return null;
        }

        ListNode s=head;
        ListNode f=head.next.next;

        while(s!=null && f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        s.next=s.next.next;

        return head;
    }
}
