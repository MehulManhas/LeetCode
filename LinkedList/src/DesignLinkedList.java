import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesignLinkedList {
    private static class  ListNode {
        public int val;
        public ListNode next;
        ListNode(int x) { val = x; next = null; }
    }
    int listSize = 0;
    public ListNode solve(ArrayList<ArrayList<Integer>> A) {
        ListNode head = new ListNode(-1);
        head = head.next;

        for(ArrayList<Integer> currentList : A){
            int typeOfOperation = currentList.get(0);

            if(typeOfOperation == 0){
                int value = currentList.get(1);
                int position = currentList.get(2);
                head = appendNodeBeforeHead(head, value);
            }
            else if(typeOfOperation == 1){
                int value = currentList.get(1);
                int position = currentList.get(2);
                head = appendNodeAtEnd(head, value);
            }
            else if(typeOfOperation == 2){
                int value = currentList.get(1);
                int position = currentList.get(2);
                head = appendNodeInBetween(head, value, position);
            }
            else if(typeOfOperation == 3){
                int position = currentList.get(1);
                int value = currentList.get(2);
                head = deleteNode(head, position);
            }
        }
        ListNode dummyHead = head;

        while(dummyHead.next != null){
            System.out.print(dummyHead.val);
            dummyHead = dummyHead.next;
        }
        System.out.print(dummyHead.val);

        if(head == null){
            return new ListNode(0);
        }
        return head;
    }
    public ListNode appendNodeBeforeHead(ListNode head, int value){
        ListNode newHead = new ListNode(value);

        if(listSize == 0){
            listSize++;
            return newHead;
        }

        if(listSize > 0){
            listSize++;
            newHead.next = head;
        }

        return newHead;
    }
    public ListNode appendNodeAtEnd(ListNode head, int value){
        ListNode dummyHead = head;

        if(head == null){
            listSize++;
            return new ListNode(value);
        }

        while(dummyHead.next != null){
            dummyHead = dummyHead.next;
        }

        ListNode newNode = new ListNode(value);
        dummyHead.next = newNode;
        newNode.next = null;
        listSize++;

        return head;
    }

    public ListNode appendNodeInBetween(ListNode head, int value, int position){
        ListNode dummyHead = head;

        int index = 0;

        if(listSize > position){
            while (index < position-2){
                dummyHead = dummyHead.next;
                index++;
            }

            ListNode newNode = new ListNode(value);
            ListNode tempNode = dummyHead.next;
            dummyHead.next = newNode;
            newNode.next = tempNode;
            listSize++;

        }

        return head;
    }
    public ListNode deleteNode(ListNode head, int position){
        ListNode dummyHead = head;

        int index = 0;

        if(listSize >= position){
            while (index < position-1){
                dummyHead = dummyHead.next;
                index++;
            }

            if(dummyHead.next != null && dummyHead.next.next != null){
                dummyHead.next = dummyHead.next.next;
                listSize--;
            }
            else if(dummyHead.next != null && dummyHead.next.next == null){
                dummyHead.next = null;
                listSize--;
            }
            else if(dummyHead.next == null){
                listSize--;
                return null;
            }
        }

        else if(listSize == position){
            while (index < position-2){
                dummyHead = dummyHead.next;
                index++;
            }

            if(listSize == 1 && dummyHead.next == null){
                listSize--;
                return null;
            }
            else if(dummyHead.next.next == null){
               dummyHead.next = null;
               listSize--;
            }
        }


        return head;
    }
}
