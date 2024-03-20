public class MergeInBetweenLinkedLists {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummyHead = list1;
        int idx = 0;

        while(dummyHead != null){
            if(idx == a-1){
                ListNode temp = dummyHead;
                dummyHead = dummyHead.next;

                temp.next = list2;

                while(list2.next != null){
                    list2 = list2.next;
                }
            }
            else if(idx == b){
                list2.next = dummyHead.next;
            }else{
                dummyHead = dummyHead.next;
            }
            idx++;
        }

        return list1;
    }
}
