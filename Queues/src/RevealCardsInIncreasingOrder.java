//https://leetcode.com/problems/reveal-cards-in-increasing-order/?envType=daily-question&envId=2024-04-10
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        int[] deckCopy = Arrays.copyOf(deck, deck.length);
        int[] result = new int[deckCopy.length];
        Queue<Integer> idxQueue = new LinkedList<>();
        Arrays.sort(deckCopy);

        for(int i=0; i<deckCopy.length; i++){
            idxQueue.add(i);
        }

        for(int i=0; i<deckCopy.length; i++){
            result[idxQueue.poll()] = deckCopy[i];
            idxQueue.add(idxQueue.poll());
        }

        return result;
    }
}
