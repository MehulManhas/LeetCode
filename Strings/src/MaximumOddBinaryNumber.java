public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int numberOfOnes = countOnes(s);
        StringBuilder stringBuilder = new StringBuilder();

        for(int i=0; i<s.length()-1; i++){
            if(numberOfOnes > 1){
                stringBuilder.append("1");
                numberOfOnes--;
            }
            else{
                stringBuilder.append("0");
            }
        }

        return stringBuilder.append("1").toString();
    }
    public int countOnes(String s){
        int numberOfOnes = 0;
        for(char c : s.toCharArray()){
            if(c == '1'){
                numberOfOnes++;
            }
        }
        return numberOfOnes;
    }
}
