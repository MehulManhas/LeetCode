public class RemoveLoopFromLinkedList {
    public ListNode solve(ListNode A) {
        ListNode fastPtr = A;
        ListNode slowPtr = A;
        ListNode cyclicNode = null;

        while(fastPtr != null && fastPtr.next != null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr == fastPtr){
                cyclicNode = slowPtr;
                break;
            }
        }

        slowPtr = A;

        while (slowPtr != cyclicNode){

            if(cyclicNode.next == slowPtr.next)
            {
                cyclicNode.next = null;
                break;
            }
            slowPtr = slowPtr.next;
            cyclicNode = cyclicNode.next.next;
        }

        return A;
    }
}
