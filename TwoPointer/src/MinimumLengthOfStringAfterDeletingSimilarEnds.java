import java.util.ArrayList;

public class MinimumLengthOfStringAfterDeletingSimilarEnds {
    public class CharIntMap{
        public char alphabet;
        public int frequency;

        public CharIntMap(char alphabet, int frequency){
            this.alphabet = alphabet;
            this.frequency = frequency;
        }
    }

    public int minimumLengthApproachOne(String s) {
        ArrayList<CharIntMap> preProcessedList = createPreProcessedList(s);

        return calculateSubtractedLengthOfList(preProcessedList, s);

    }

    public ArrayList<CharIntMap> createPreProcessedList(String s){

        ArrayList<CharIntMap> preProcessedList = new ArrayList<CharIntMap>();
        int currentIndex = 0;
        char currentChar = s.charAt(0);
        int currentFrequency = 1;

        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                preProcessedList.add(currentIndex++, new CharIntMap(currentChar, currentFrequency));
                currentChar = s.charAt(i);
                currentFrequency = 1;
            }
            else{
                currentFrequency++;
            }
        }

        preProcessedList.add(currentIndex, new CharIntMap(currentChar, currentFrequency));

        return preProcessedList;
    }

    public int calculateSubtractedLengthOfList(ArrayList<CharIntMap> preProcessedList, String s){
        int startIndex = 0;
        int endIndex = preProcessedList.size()-1;
        int lengthOfString = s.length();

        while(startIndex < endIndex){
            CharIntMap leftMap = preProcessedList.get(startIndex);
            CharIntMap rightMap = preProcessedList.get(endIndex);

            if(leftMap.alphabet == rightMap.alphabet){
                lengthOfString = lengthOfString - leftMap.frequency - rightMap.frequency;
            }
            else{
                return lengthOfString;
            }
            startIndex++;
            endIndex--;
        }

        if(preProcessedList.get(startIndex).alphabet == preProcessedList.get(endIndex).alphabet && preProcessedList.get(endIndex).frequency != 1){
            lengthOfString = lengthOfString - preProcessedList.get(startIndex).frequency;
        }

        return lengthOfString;
    }

    public int minimumLengthApproachTwo(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right && s.charAt(left) == s.charAt(right)){
            char currentChar = s.charAt(left);

            while (left<=right && s.charAt(left) == currentChar){
                left++;
            }

            while (left<=right && s.charAt(right) == currentChar){
                right--;
            }
        }
        return Math.max(0, right - left + 1);
    }
}
