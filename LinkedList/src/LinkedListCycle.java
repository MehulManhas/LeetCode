//https://leetcode.com/problems/linked-list-cycle/?envType=daily-question&envId=2024-03-06
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
