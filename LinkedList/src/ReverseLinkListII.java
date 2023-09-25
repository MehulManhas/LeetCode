import java.util.List;

public class ReverseLinkListII {

    public ListNode reverseBetween(ListNode A, int B, int C) {

        return reverseLinkedList(A, B, C);
    }

    public ListNode reverseLinkedList(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode prevNode = dummyHead;

        for(int i=0; i <left-1; i++){
            prevNode = prevNode.next;
        }

        ListNode currentNode = prevNode.next;
        //1 2 3 4 5
        //1 2 3 5   4
        //

        for(int i=0; i<right-left; ++i){
            ListNode nextNode = currentNode.next;
            currentNode.next = nextNode.next;
            nextNode.next = prevNode.next;
            prevNode.next = nextNode;

        }

        return dummyHead.next;
    }

}
