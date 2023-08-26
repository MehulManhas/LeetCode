public class Main {
    public static void main(String[] args) {

        String[] A = new String[]{"adar80", "shivam95", "mehul95"};
        SortStudentsAndMarks sortStudentsAndMarks = new SortStudentsAndMarks();

        for(String s : sortStudentsAndMarks.solve(A)){
            System.out.println(s);
        }

    }
}