import java.util.List;

public class ReorderList {
    public ListNode reorderList(ListNode A) {
        ListNode head = A;
        ListNode slow = A;
        ListNode fast = A;


        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }

        ListNode mid = slow;
        ListNode secondHalfHead = mid.next;
        mid.next = null;


        ListNode reversedHead = reverseList(secondHalfHead);
        ListNode dummyHead = mergeLists(head, reversedHead);

        return dummyHead;
    }

    public ListNode reverseList(ListNode A){

        ListNode tempHead = A;
        ListNode reverseHead = null;

        while(tempHead != null){
            ListNode tempNode = tempHead;
            tempHead = tempHead.next;
            tempNode.next = reverseHead;
            reverseHead = tempNode;
        }
        return reverseHead;
    }

    public ListNode mergeLists(ListNode head, ListNode reversedHead){
        ListNode temp = head;
        ListNode dummyHead = head;

        while(head != null && reversedHead != null){
            head = head.next;
            temp.next = reversedHead;
            reversedHead = reversedHead.next;
            temp = temp.next;
            temp.next = head;
            temp = temp.next;
        }

        return dummyHead;
    }


    public void printLinkedList(ListNode head){
        while (head != null){
            System.out.print(head.val);
            head = head.next;
        }
    }

}
