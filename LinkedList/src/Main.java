import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3,4};
//        int indexFromLast = 3;
//        ListNode head = new ListNode(0);
//        ListNode tempHead = head;
//
//        for(int i : arr){
//            tempHead.next = new ListNode(i);
//            tempHead = tempHead.next;
//        }
//        head = head.next;
//
////        while(head != null){
////            System.out.println(head.val);
////            head = head.next;
////        }
//
//        RemoveNthNodeFromListEnd removeNthNodeFromListEnd = new RemoveNthNodeFromListEnd();
//        removeNthNodeFromListEnd.removeNthFromEnd(head, indexFromLast);
//
//        while(head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }

//        ListNode head = new ListNode(0);
//        ListNode tempHead = head;
//        int[] arr = new int[]{1,1,2,2,3};
//
//        for(int i : arr){
//            tempHead.next = new ListNode(i);
//            tempHead = tempHead.next;
//        }
//        head = head.next;
//
//        RemoveDuplicatesFromSortedList removeDuplicatesFromSortedList = new RemoveDuplicatesFromSortedList();
//        removeDuplicatesFromSortedList.deleteDuplicates(head);
//
//        while(head != null){
//            System.out.println(head.val);
//            head = head.next;
//        }


//        ListNode head = new ListNode(0);
//        ListNode tempHead = head;
//        int[] arr = new int[]{1,2,3,4,5};
//
//        for(int i : arr){
//            tempHead.next = new ListNode(i);
//            tempHead = tempHead.next;
//        }
//
//        int B = 2;
//        int C = 4;
//
//        head = head.next;
//
//        ReverseLinkListII reverseLinkListII = new ReverseLinkListII();
//        ListNode ans = reverseLinkListII.reverseBetween(head, B, C);
//
//        while(ans != null){
//            System.out.println(ans.val);
//            ans = ans.next;
//        }

        ArrayList<ArrayList<Integer>>  A = new ArrayList<>();
        //[1,13,-1],[3,0,-1],[3,1,-1],[2,15,0],[3,0,-1],[1,12,-1],[3,0,-1],[1,19,-1],[1,13,-1],[3,0,-1],[0,12,-1],[1,13,-1],[3,2,-1]
        A.add(0, new ArrayList<>(Arrays.asList(1,13,-1)));
        A.add(1, new ArrayList<>(Arrays.asList(3,0,-1)));
        A.add(2, new ArrayList<>(Arrays.asList(3,1,-1)));
        A.add(3, new ArrayList<>(Arrays.asList(2,15,0)));
        A.add(4, new ArrayList<>(Arrays.asList(3,0,-1)));
        A.add(5, new ArrayList<>(Arrays.asList(1,12,-1)));
        A.add(6, new ArrayList<>(Arrays.asList(3,0,-1)));
        A.add(7, new ArrayList<>(Arrays.asList(1,19,-1)));
        A.add(8, new ArrayList<>(Arrays.asList(1,13,-1)));
        A.add(9, new ArrayList<>(Arrays.asList(3,0,-1)));
        A.add(10, new ArrayList<>(Arrays.asList(0,12,-1)));
        A.add(11, new ArrayList<>(Arrays.asList(1,13,-1)));
        A.add(12, new ArrayList<>(Arrays.asList(3,2,-1)));


        DesignLinkedList designLinkedList = new DesignLinkedList();
        System.out.println(designLinkedList.solve(A));
    }
}