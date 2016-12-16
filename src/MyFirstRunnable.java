import java.util.Arrays;
public class MyFirstRunnable implements Runnable{
    @Override
    public void run() {
        long startT= System.currentTimeMillis();
        System.out.println("In a thread");
        int[] list = new int[ParanelSort.arraySize];
        for (int i = 0; i < ParanelSort.arraySize; i++) {
            list[i] = (int) (Math.random() * ParanelSort.integerRange + 1);
        }
        Arrays.sort(list);
        long stopT= System.currentTimeMillis();
        long MeasureTime = stopT-startT;
        System.out.println("MeasureTimeOfThread: " + MeasureTime + " ms");
    }
}