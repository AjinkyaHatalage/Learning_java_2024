package Advanced_Java.ConcurrencyAndThreads.ThreadSynchronizationInJava;

import Advanced_Java.ConcurrencyAndThreads.Thread1;

public class SynchronizationDemo {
    public static void main(String[] args) {
        MathUtil obj = new MathUtil();
        thread1 t1 = new thread1(obj);
         Thread t2 = new Thread(new thread2(obj));
         t1.start();
         t2.start();
    }
}

/* Output
4
8
12
16
20
5
10
15
20
25
* */
