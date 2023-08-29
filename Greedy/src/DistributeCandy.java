public class DistributeCandy {

    int[] students;

    public DistributeCandy(int[] students){
        this.students = students;
    }

    public int distributeCandiesWithStudents(){
        int[] leftMin = makeLeftMin(students);
        int[] rightMin = makeRightMin(students);

        return compute(leftMin, rightMin);
    }

    public int[] makeLeftMin(int[] students){
        int[] leftMin = new int[students.length];

        for(int i=0; i<leftMin.length; i++){
            if(i==0){
                leftMin[i] = 1;
            }
            else if(students[i] > students[i-1]){
                leftMin[i] = leftMin[i-1]+1;
            }
        }
        return leftMin;
    }

    public int[] makeRightMin(int[] students){
        int[] rightMin = new int[students.length];

        for(int i= rightMin.length-1; i>=0; i--){
            if(i==rightMin.length-1){
                rightMin[i] = 1;
            }
            else if(students[i] > students[i+1]){
                rightMin[i] = rightMin[i+1]+1;
            }
        }
        return rightMin;
    }

    public int compute(int[] leftMin, int[] rightMin){
        int ans = 0;

        for(int i=0; i<leftMin.length; i++){
            ans += Math.max(leftMin[i], rightMin[i]);
        }
        return ans;
    }


}
