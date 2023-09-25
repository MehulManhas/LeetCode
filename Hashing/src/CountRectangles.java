import java.util.HashSet;
import java.util.Objects;

public class CountRectangles {

    public static class Points{
        int x;
        int y;

        public Points(int x, int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null || obj.getClass() != this.getClass()){
                return false;
            }

            Points p = (Points) obj;
            return this.x == p.x && this.y == p.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public int solve(int[] A, int[] B){
        HashSet<Points> setOfPoints = new HashSet<>();
        int count = 0;

        for(int i=0; i<A.length; i++ ){
            setOfPoints.add(new Points(A[i], B[i]));
        }

        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){
                if(A[i] != A[j] && B[i] != B[j] && setOfPoints.contains(new Points(A[i], B[j])) && setOfPoints.contains(new Points(A[j], B[i]))){
                    count++;
                }
            }
        }

        return count/2;
    }

}
