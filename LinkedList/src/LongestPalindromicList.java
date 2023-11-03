import java.util.ArrayList;

public class LongestPalindromicList {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val){
            this.val = val;
            this.next = null;
        }
    }

    public int solve(ListNode A) {
        int maxLength = 1;

        ListNode reverseListStart = A;
        ListNode nextNode = reverseListStart.next;
        reverseListStart.next = null;

        while (nextNode != null){
            int oddLength = validateForOddLength(reverseListStart, nextNode);
            maxLength = Math.max(maxLength, oddLength);
            int evenLength = validateForEvenLength(reverseListStart, nextNode);
            maxLength = Math.max(maxLength, evenLength);

            ListNode current = nextNode;
            nextNode = nextNode.next;
            current.next = reverseListStart;
            reverseListStart = current;
        }
        return maxLength;
    }

    private int validateForOddLength(ListNode node1, ListNode node2){
        int length = 1;
        ListNode current = node1;
        ListNode nextNode = node2.next;

        while (current != null && nextNode != null && current.val == nextNode.val){
            current = current.next;
            nextNode =nextNode.next;
            length = length+2;
        }

        return length;
    }

    private int validateForEvenLength(ListNode node1, ListNode node2){
        int length = 0;
        ListNode current = node1;
        ListNode nextNode = node2;

        while (current != null && nextNode != null && current.val == nextNode.val){
            current = current.next;
            nextNode = nextNode.next;
            length = length+2;
        }

        return length;
    }
}

