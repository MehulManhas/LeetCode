public class RemoveNthNodeFromListEnd {

    public RemoveNthNodeFromListEnd(){

    }

    public ListNode removeNthFromEnd(ListNode A, int B) {
        int size = sizeOfLinkedList(A);

        if(B == 1 && A.next == null){
            return null;
        }

        if(B >= size){
            A = A.next;
            return A;
        }

        removeFromLast(A, size, B);

        return A;
    }

    public int sizeOfLinkedList(ListNode A){
        ListNode tempHead = A;
        int size = 0;

        while(tempHead != null){
            tempHead = tempHead.next;
            size++;
        }
        return size;
    }

    public void removeFromLast(ListNode A, int size, int B){
        int currentNodeNumber = 1;
        ListNode tempHead = A;

        int nodeNumberToBeDeleted = B == 1 ? size - 1 : size - B;

        while(currentNodeNumber < nodeNumberToBeDeleted){
            tempHead = tempHead.next;
            currentNodeNumber++;
        }

        tempHead.next = tempHead.next.next;
    }
}
