//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/?envType=study-plan-v2&envId=leetcode-75
public class DeleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }

        if(head.next.next == null){
            head.next = null;
            return head;
        }
        ListNode dummyHead = head;
        int size = calcSizeOfLinkedList(dummyHead);

        size = size/2;
        int counter = 1;

        dummyHead = head;

        while(counter < size){
            dummyHead = dummyHead.next;
            counter++;
        }

        //System.out.println(size + " " + counter + " " + dummyHead.val);

        dummyHead.next = dummyHead.next.next;

        return head;
    }

    public int calcSizeOfLinkedList(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }

        return size;
    }

    public ListNode deleteMiddleApproach2(ListNode head) {

        if(head == null || head.next == null){
            return null;
        }
        ListNode fast = head.next.next;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}
