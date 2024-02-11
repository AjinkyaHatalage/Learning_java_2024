package OOPs;

class Bank{
   int getRateOfInterest(){
         return 0;
   }
}
class ICICI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class SBI extends Bank{
    int getRateOfInterest(){
        return 9;
    }
}
class Axis extends Bank{
    int getRateOfInterest(){
        return 10;
    }
}
public class TestMethodOverridingploymorphism {
    public static void main(String[] args) {
        SBI s = new SBI();
        Axis a =new Axis();
        ICICI i = new ICICI();
        System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
        System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
    }
}
