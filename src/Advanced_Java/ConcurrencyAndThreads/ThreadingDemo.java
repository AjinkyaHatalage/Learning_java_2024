package Advanced_Java.ConcurrencyAndThreads;

public class ThreadingDemo {
    // Threads run in parallel not in sequence
    public static void main(String[] args) {
        int n = 10; // number of threads
        int cnt=0;
        for(int i=0;i<n;i++){
            Thread1 t1 = new Thread1();
            t1.start();

            Thread t2 = new Thread(new Thread2());
            t2.start();

        cnt++;
        }
        System.out.println("Counter value is: "+cnt);
    }

}
