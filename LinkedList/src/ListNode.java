public class ListNode {
    int val = 0;
    ListNode next;

    public ListNode(){

    }
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }
}
