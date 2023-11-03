import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesignLinkedList {
    private int listSize = 0;

    private ListNode head;

    private ListNode tail;

    public DesignLinkedList(){
        head = null;
        tail = null;
    }

    public ListNode solve(ArrayList<ArrayList<Integer>> A) {

        for(ArrayList<Integer> currentList : A){
            int typeOfOperation = currentList.get(0);

            if(typeOfOperation == 0){
                int value = currentList.get(1);
                appendNodeBeforeHead(value);
            }
            else if(typeOfOperation == 1){
                int value = currentList.get(1);
                appendNodeAtEnd(value);
            }
            else if(typeOfOperation == 2){
                int value = currentList.get(1);
                int position = currentList.get(2);
                appendNodeInBetween(value, position);
            }
            else if(typeOfOperation == 3){
                int position = currentList.get(1);
                deleteNode(position);
            }
        }

        return head;
    }

    public void appendNodeBeforeHead(int value){
        ListNode newHead = new ListNode(value);
        newHead.next = head;
        head = newHead;

        if(tail == null){
            tail = newHead;
        }

        listSize++;
    }

    public void appendNodeAtEnd(int value){
        ListNode newNode = new ListNode(value);

        if(head == null){
            head = newNode;
            tail = newNode;
            listSize++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        listSize++;
    }

    public void appendNodeInBetween(int value, int position){
        if(position < 0 || position > (listSize+1)){
            return;
        }

        if(position == listSize){
            appendNodeAtEnd(value);
            return;
        }

        if(position == 0){
            appendNodeBeforeHead(value);
            return;
        }

        ListNode newNode = new ListNode(value);
        ListNode temp = head;
        int count = 0;

        while (count < position-1){
            temp = temp.next;
            count++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        listSize++;
    }

    public void deleteNode(int position){
        if(position < 0 || position >= listSize){
            return;
        }

        if(position == 0){
            if(head == null){
                return;
            }

            if(head == tail){
                head = head.next;
                tail = head;
                listSize--;
                return;
            }

            head = head.next;
            listSize--;
            return;
        }

        ListNode temp = head;
        int count = 0;

        while (count < position-1){
            temp = temp.next;
            count++;
        }

        temp.next = temp.next.next;

        if(position == listSize-1){
            tail = temp;
        }

        listSize--;
    }
}
