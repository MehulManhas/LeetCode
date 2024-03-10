import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/linked-list-frequency/description/
public class LinkedListFrequency {
    public ListNode frequenciesOfElements(ListNode head) {
        if(head == null){
            return null;
        }
        HashMap<Integer, Integer> setOfIntegers = new HashMap<>();
        ListNode dummyHead = head;

        while(dummyHead != null){
            setOfIntegers.putIfAbsent(dummyHead.val, setOfIntegers.get(dummyHead.val)+1);
            dummyHead = dummyHead.next;
        }
        dummyHead = new ListNode(-1);
        ListNode ans = dummyHead;
        for(Map.Entry<Integer, Integer> entry : setOfIntegers.entrySet()){
            dummyHead.next = new ListNode();
            dummyHead = dummyHead.next;
        }

        return ans.next;

    }
}
