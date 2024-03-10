//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null) {
            return head;
        }

        ListNode prev = null;
        ListNode next = head.next;
        ListNode curr = head;

        while(curr!=null) {
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}
