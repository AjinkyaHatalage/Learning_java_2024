package Advanced_Java.ConcurrencyAndThreads.ThreadSynchronizationInJava;

public class thread2 implements Runnable{

    MathUtil mu;

    public thread2(MathUtil mu){
        this.mu=mu;
    }
    @Override
    public void run() {
        try{
           mu.getMultiples(5);
        }
         catch (Exception e){
            System.out.println("Exception is Catched :"+ e);
        }
    }
}
