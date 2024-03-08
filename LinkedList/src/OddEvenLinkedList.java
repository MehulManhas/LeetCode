//https://leetcode.com/problems/odd-even-linked-list/?envType=study-plan-v2&envId=leetcode-75
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode oddListNode = head;
        ListNode evenListNode = head.next;

        ListNode finalOddHead = oddListNode;
        ListNode finalEvenHead = evenListNode;

        while(oddListNode.next != null && evenListNode.next != null){
            ListNode nextTempOdd = oddListNode.next.next;
            ListNode nextTempEven = evenListNode.next.next;

            oddListNode.next = nextTempOdd;
            evenListNode.next = nextTempEven;

            oddListNode = oddListNode.next;
            evenListNode = evenListNode.next;
        }

        oddListNode.next = finalEvenHead;
        return finalOddHead;
    }
}
