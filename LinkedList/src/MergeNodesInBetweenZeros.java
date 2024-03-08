public class MergeNodesInBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode leftZero = head;
        ListNode rightZero = head.next;
        ListNode ansHead = leftZero;

        int runningSum = 0;

        while(rightZero != null){
            if(rightZero.val == 0){
                rightZero.val = runningSum;
                leftZero.next = rightZero;
                leftZero = leftZero.next;
                runningSum = 0;
            }
            else{
                runningSum += rightZero.val;
            }
            rightZero = rightZero.next;
        }
        return ansHead.next;
    }
}
