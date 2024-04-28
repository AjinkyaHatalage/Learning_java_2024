package Advanced_Java.ConcurrencyAndThreads;

class Thread2 implements Runnable{
    public void run(){
        try {
            System.out.println("Thread2 is Running");
        }
        catch (Exception e){
            System.out.println("Exceptoion in Thread2 Caught "+ e);
        }
    }
}
