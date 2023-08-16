public class Main {
    public static void main(String[] args) {

        KPlacesApart kPlacesApart = new KPlacesApart();

        int[] A = new int[]{1,4,6,3,9,10};
        int B = 4;
        A = kPlacesApart.solve(A, B);

        for(int i : A){
            System.out.println(i);
        }
    }
}