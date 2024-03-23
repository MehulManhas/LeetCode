public class ReorderListDailyQuestion {
    public void reorderList(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        ListNode dummyHead = head;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        ListNode reversedHead = reverseList(slowPtr);

        while(reversedHead.next != null){
            ListNode temp = dummyHead.next;
            dummyHead.next = reversedHead;
            dummyHead = temp;

            temp = reversedHead.next;
            reversedHead.next = dummyHead;
            reversedHead = temp;
        }

    }

    public ListNode reverseList(ListNode head){
        ListNode prevNode = null;
        ListNode currentNode = head;
        ListNode nextNode = null;

        while(currentNode != null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;

        }

        return prevNode;
    }
}
