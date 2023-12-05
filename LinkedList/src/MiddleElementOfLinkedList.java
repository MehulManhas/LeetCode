public class MiddleElementOfLinkedList {
    public int solve(ListNode A) {
        ListNode fastPointer = A;
        ListNode slowPointer = A;

        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        return slowPointer.val;
    }
}
