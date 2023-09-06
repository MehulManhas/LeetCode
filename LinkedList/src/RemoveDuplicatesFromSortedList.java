import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesFromSortedList {

    public RemoveDuplicatesFromSortedList(){}

    public ListNode deleteDuplicates(ListNode A) {

        if(A == null){
            return null;
        }

        ListNode head = A;

        while(head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }
            else{
                head = head.next;
            }
        }

        return A;
    }
}
