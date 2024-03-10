//https://leetcode.com/problems/winner-of-the-linked-list-game/?envType=weekly-question&envId=2024-03-01
public class WinnerOfLinkedListGame {
    public String gameResult(ListNode head) {
        int ans = 0;
        ListNode evenHead = head;
        ListNode oddHead = head.next;

        while(oddHead.next != null){
            if(evenHead.val > oddHead.val){
                ans++;
            }
            else if(evenHead.val < oddHead.val){
                ans--;
            }
            evenHead = evenHead.next.next;
            oddHead = oddHead.next.next;
        }

        if(evenHead.val > oddHead.val){
            ans++;
        }
        else if(evenHead.val < oddHead.val){
            ans--;
        }

        if(ans < 0){
            return "Odd";
        }
        else if(ans > 0){
            return "Even";
        }

        return "Tie";
    }
}
