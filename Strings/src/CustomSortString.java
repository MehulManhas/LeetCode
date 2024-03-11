public class CustomSortString {
    public String customSortString(String order, String s) {
        int[] alphabets = createAlphabetMap(s);
        StringBuilder sb = addOrder(order, alphabets);
        return addRemainingChars(sb, alphabets);
    }
    public int[] createAlphabetMap(String s){
        int[] alphabets = new int[26];
        for(int i=0; i<s.length(); i++){
            alphabets[s.charAt(i)-'0'-49]++;
        }

        return alphabets;
    }
    public StringBuilder addOrder(String order, int[] alphabets){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<order.length(); i++){
            int count = alphabets[order.charAt(i)-'0'-49];
            for(int j=0; j<count; j++){
                sb.append(order.charAt(i));
                alphabets[order.charAt(i)-'0'-49]--;
            }
        }

        return sb;
    }
    public String addRemainingChars(StringBuilder sb, int[] alphabets){
        for(int i=0; i<alphabets.length; i++){
            int count = alphabets[i];

            for(int j=0; j<count; j++){
                sb.append((char) (i + 49 + '0'));
                alphabets[i]--;
            }
        }

        return sb.toString();
    }
}
