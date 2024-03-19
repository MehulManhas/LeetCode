public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        int[] freqArr = new int[26];
        int maxCount = 0;

        for(char task : tasks){
            freqArr[task - 'A']++;
            maxCount = Math.max(maxCount, freqArr[task - 'A']);
        }

        int time = (maxCount-1)*(n+1);

        for(int f : freqArr){
            if(f==maxCount){
                time++;
            }
        }

        return Math.max(tasks.length, time);
    }
}
