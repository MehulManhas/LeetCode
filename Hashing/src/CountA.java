public class CountA {
    public CountA(){}

    public int solve(String A) {
        int countOfA = 0;

        for(char c : A.toCharArray()){
            if(c == 'a'){
                countOfA++;
            }
        }

        return (countOfA*(countOfA+1))/2;
    }
}
