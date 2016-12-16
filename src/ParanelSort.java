import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
                                 /********  Created by BaoChu on 11/17/16.  ********/
public class ParanelSort {
    public static int arraySize = 5000000;
    public static int integerRange = 2000000;
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        for (int j=0; j < 4; j++) {
            int[] list = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                list[i] = (int) (Math.random() * integerRange + 1);
            }
            Arrays.sort(list);
        }
        long end = System.currentTimeMillis();
        long run = end - start;
        System.out.println("Sequential Time: " + run + "ms");

        //Paralllel code
        System.out.println("Running parallel");

        for(int i = 0; i < 4; i++) {
            Runnable runnable = new MyFirstRunnable();
            Thread thread = new Thread(runnable);
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}


