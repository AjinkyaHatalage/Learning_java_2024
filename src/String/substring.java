package String;

import static java.lang.Math.pow;

public class substring {
    public static void main(String[] args) {
        String name="Ajinkya Hatalage";
        System.out.println(" only with begin index : "+name.substring(3));
        System.out.println("with begin and end index : "+ name.substring(6,9));
        try{
            System.out.println("before subsequence");
            System.out.println(name.subSequence(6,3));
            System.out.println("After subsequence");
        }
        catch (Exception e){
            System.out.println("Exception is occured : "+e);
        }
        finally {
            int num = 100;
            System.out.println(pow(2,6));
            System.out.println("Ending the program from finally");
        }
    }
}
