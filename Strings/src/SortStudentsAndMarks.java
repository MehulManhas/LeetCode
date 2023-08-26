import java.util.ArrayList;

public class SortStudentsAndMarks {

    public SortStudentsAndMarks(){}

    public String[] solve(String[] A) {
        ArrayList<ArrayList<String>> listOfStudentsWithMarks = new ArrayList<>();

        for(int i=0; i<=100; i++){
            listOfStudentsWithMarks.add(new ArrayList<>());
        }

        for(String studentAndMarks : A){
            for(int i=0; i<studentAndMarks.length(); i++){
                if(studentAndMarks.charAt(i) >= 48 && studentAndMarks.charAt(i) <= 57){
                    String name = studentAndMarks.substring(0, i);
                    int marks = Integer.parseInt(studentAndMarks.substring(i));
                    listOfStudentsWithMarks.get(marks).add(name);
                    break;
                }
            }
        }

        int arrayItr = 0;

        for(int i=100; i>=0; i--){
            if(!listOfStudentsWithMarks.get(i).isEmpty()){
                for(int j=0; j<listOfStudentsWithMarks.get(i).size(); j++){
                    A[arrayItr] = listOfStudentsWithMarks.get(i).get(j)+i;
                    arrayItr++;
                }
            }

        }
        return A;
    }
}
