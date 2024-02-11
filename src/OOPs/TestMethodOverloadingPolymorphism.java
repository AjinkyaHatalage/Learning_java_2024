package OOPs;


public class TestMethodOverloadingPolymorphism {
    static int add(int a){
         return  a;
    }
   static float add(int a , float b)
    {
        float mya = (float)a;
        return a+ mya ;
    }
    static int add(int a, int b,int c)
    {
        return a+b+c;
    }

    public static void main(String[] args) {

        System.out.println( add(5));
        System.out.println(add(5,3.42f));
        System.out.println(add(4,5,2));



        System.out.println();
    }
}
