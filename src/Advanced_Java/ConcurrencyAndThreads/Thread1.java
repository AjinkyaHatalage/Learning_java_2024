package Advanced_Java.ConcurrencyAndThreads;

public class Thread1 extends Thread{
    // overrided run method
    @Override
  public void run(){
      try {
          System.out.println("Thread1 is Runnning");
      }
      catch (Exception e){
          //Throwing an exception
          System.out.println("Exception raised in Thread1"+ e);
      }
  }
}
