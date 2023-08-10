public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int indexFromLast = 3;
        ListNode head = new ListNode(0);
        ListNode tempHead = head;

        for(int i : arr){
            tempHead.next = new ListNode(i);
            tempHead = tempHead.next;
        }
        head = head.next;

//        while(head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }

        RemoveNthNodeFromListEnd removeNthNodeFromListEnd = new RemoveNthNodeFromListEnd();
        removeNthNodeFromListEnd.removeNthFromEnd(head, indexFromLast);

        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}