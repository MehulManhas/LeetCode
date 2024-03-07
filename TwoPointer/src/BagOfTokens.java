import java.util.Arrays;

public class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        int lowIndex = 0;
        int highIndex = tokens.length-1;

        int score = 0;

        Arrays.sort(tokens);

        while(lowIndex <= highIndex){
            if(power >= tokens[lowIndex]){
                score++;
                power -= tokens[lowIndex++];
            }
            else if(score > 0 && lowIndex < highIndex){
                score--;
                power += tokens[highIndex--];
            }
            else{
                return score;
            }
        }
        return score;
    }
}
