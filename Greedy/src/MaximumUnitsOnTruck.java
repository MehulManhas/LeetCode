import java.util.Arrays;
import java.util.Collections;

public class MaximumUnitsOnTruck {

    int[][] boxTypes;
    int truckSize = 0;

    public MaximumUnitsOnTruck(int[][] boxTypes, int truckSize){
        this.boxTypes = boxTypes;
        this.truckSize = truckSize;
    }

    public int maximumUnits() {

        Pairs[] pairs = new Pairs[boxTypes.length];

        for(int i=0; i<boxTypes.length; i++){
            pairs[i] = new Pairs(boxTypes[i][0], boxTypes[i][1]);
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(b.numberOfUnitsPerBox, a.numberOfUnitsPerBox));

        int sizeFilled = 0;
        int itr = 0;
k
        while(truckSize >= 0 && itr < pairs.length){
            if(pairs[itr].numberOfBoxes > truckSize){
                sizeFilled += truckSize * pairs[itr].numberOfUnitsPerBox;
                truckSize = 0;
                break;
            }
            else {
                truckSize -= pairs[itr].numberOfBoxes;
                sizeFilled += pairs[itr].numberOfUnitsPerBox * pairs[itr].numberOfBoxes;
            }
            itr++;
        }
        return sizeFilled;
    }
}
class Pairs{
    int numberOfBoxes = 0;
    int numberOfUnitsPerBox = 0;

    Pairs(int numberOfBoxes, int numberOfUnitsPerBox){
        this.numberOfBoxes = numberOfBoxes;
        this.numberOfUnitsPerBox = numberOfUnitsPerBox;
    }
}
