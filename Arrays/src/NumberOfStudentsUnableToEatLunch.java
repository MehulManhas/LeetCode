//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/?envType=daily-question&envId=2024-04-08
public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        for(int student:students) {
            count[student]++;
        }
        for(int sandwich:sandwiches) {
            if(count[sandwich]==0) {
                return count[(sandwich+1)%2];
            }
            count[sandwich]--;
        }
        return 0;
    }
}
