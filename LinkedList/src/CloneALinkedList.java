import java.util.List;

public class CloneALinkedList {
    static class ListNode {
        int val;
        ListNode next, random;
        ListNode(int x) {
            val = x;
            next = random = null;
        }
    }

    public ListNode cloneList(ListNode A) {

        if(A == null){
            return null;
        }

        ListNode current = A;

        while (current != null){
            ListNode newNode = new ListNode(current.val);
            newNode.next = current.next;
            current.next = newNode;
            current = newNode.next;
        }

        current = A;

        while (current != null){
            if(current.random != null){
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }

        current = A;

        ListNode clonedHead = A.next;
        ListNode clonedCurrent = clonedHead;

        while (clonedCurrent.next != null){
            current.next = current.next.next;
            clonedCurrent.next = clonedCurrent.next.next;
            current = current.next;
            clonedCurrent = clonedCurrent.next;
        }

        return clonedHead;
    }
}
