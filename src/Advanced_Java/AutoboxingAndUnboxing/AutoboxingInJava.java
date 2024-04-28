package Advanced_Java.AutoboxingAndUnboxing;

public class AutoboxingInJava {
    public static void main(String[] args) {
        /*
        Autoboxing is the automatic conversion that the Java compiler makes between the
        primitive types and their corresponding object wrapper classes. For example,
        converting an int to an Integer, a double to a Double, and so on.
         If the conversion goes the other way, this is called unboxing.*/
        int i = 10;
        //Autobox
        Integer iobj = Integer.valueOf(i);
        System.out.println("Value of Integer Obj : "+ iobj +" " + iobj.getClass());

        // Auto- Unbox
        int i1 = iobj ;
        System.out.println("value of  i1: "+i1);


        char x = 'a';
        // Autobox
        Character ch = Character.valueOf(x);
        // Auto unbox
        char ch1 = ch;
        System.out.println("value of ch : "+ ch + " "+ ch.getClass());
        System.out.println("value of ch1 : "+ ch1);

    }
}
