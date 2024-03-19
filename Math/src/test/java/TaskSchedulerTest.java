import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerTest {
    public TaskScheduler taskScheduler;
    @BeforeEach
    public void setup(){
        this.taskScheduler = new TaskScheduler();
    }
    @AfterEach
    public void tearDown(){
        this.taskScheduler = null;
    }

    @Test
    void leastIntervalPositive1() {
        char[] tasks = new char[]{'A','A','A','B','B','B'};
        int n = 2;

        Assertions.assertEquals(8, taskScheduler.leastInterval(tasks, n));
    }
    @Test
    void leastIntervalPositive2() {
        char[] tasks = new char[]{'A','C','A','B','D','B'};
        int n = 1;

        Assertions.assertEquals(6, taskScheduler.leastInterval(tasks, n));
    }
    @Test
    void leastIntervalPositive3() {
        char[] tasks = new char[]{'A','A','A','B','B','B'};
        int n = 3;

        Assertions.assertEquals(10, taskScheduler.leastInterval(tasks, n));
    }

    @Test
    void leastIntervalNegative1() {
        char[] tasks = new char[]{'A','A','D','B','C','E'};
        int n = 3;

        Assertions.assertNotEquals(10, taskScheduler.leastInterval(tasks, n));
    }

}