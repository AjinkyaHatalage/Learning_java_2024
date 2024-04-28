package Advanced_Java.ConcurrencyAndThreads.ThreadSynchronizationInJava;

import Advanced_Java.ConcurrencyAndThreads.Thread1;

public class MathUtil {
    public void getMultiples(int n){
        synchronized (this) {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
