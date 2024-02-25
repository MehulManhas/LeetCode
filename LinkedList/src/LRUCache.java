import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class LRUCache {

    public static class ListNode{
        int val;
        int key;
        ListNode next;

        public ListNode(int key, int val){
            this.key = key;
            this.val = val;
            this.next = null;
        }
    }
    int capacity;
    int nodeListSize = 0;
    ListNode head;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new ListNode(-1, -1);
    }

    public int get(int key) {
        int value = -1;
        ListNode dummyHead = head.next;
        if(nodeListSize == 0){
            return value;
        }

        while (dummyHead.key != key && dummyHead != null){
            if(dummyHead.key == key){
                return dummyHead.val;
            }
        }

        return value;
    }

    public void set(int key, int value) {

        ListNode dummyHead = head.next;

        while (dummyHead.next != null){
            dummyHead = dummyHead.next;
        }

        dummyHead.next = new ListNode(key, value);
        nodeListSize++;

    }
}
