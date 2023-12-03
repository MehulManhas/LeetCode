import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(final int[] A) {
        int longestSequence = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int i : A){
            set.add(i);
        }

        for(Integer element : set){
            if(!set.contains(element-1)){
                int num = element;
                int count = 0;
                while (set.contains(num)){
                    num++;
                    count++;
                }

                longestSequence = Math.max(count, longestSequence);
            }
        }

        return longestSequence;
    }
}
