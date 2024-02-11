package OOPs;

abstract class Bank_1{
    abstract int getRateOfInterest();
}
class SBI_1 extends Bank_1{
    int getRateOfInterest(){return 8;}
}
class PNB extends Bank_1{
    int getRateOfInterest(){return 7;}
}


public class TestAbstraTclassandMethod {
    public static void main(String[] args) {
        Bank_1 b;
        b=new SBI_1();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
       b = new PNB();
        System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
    }
}
