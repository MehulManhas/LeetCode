//https://www.scaler.com/academy/mentee-dashboard/class/35582/assignment/problems/34/?navref=cl_pb_nv_tb

public class SortList {
    public ListNode sortList(ListNode A) {
        return mergeSort(A);
    }

    public ListNode mergeSort(ListNode head){

        if(head == null || head.next == null){
            return head;
        }

        ListNode middle = getMiddle(head);
        ListNode nextOfMiddle = middle.next;

        middle.next = null;

        ListNode left = mergeSort(head);
        ListNode right = mergeSort(nextOfMiddle);

        ListNode sortedList = merge(left, right);

        return sortedList;
    }

    public ListNode getMiddle(ListNode head){

        if(head == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode merge(ListNode left, ListNode right){

        ListNode result = null;

        if(left == null){
            return right;
        }
        if(right == null){
            return left;
        }

        if(left.val <= right.val){
            result = left;
            result.next = merge(left.next, right);
        }
        else{
            result = right;
            result.next = merge(left, right.next);
        }

        return result;
    }
}
