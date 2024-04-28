package Advanced_Java.ConcurrencyAndThreads.ThreadSynchronizationInJava;

public class thread1 extends Thread{
   MathUtil mu ;
   public thread1(MathUtil mu){
       this.mu=mu;
   }

    public void run() {
        try {
            mu.getMultiples(4);
        }
        catch (Exception e){
            System.out.println("Exception is Catched :"+ e);
        }
    }
}
