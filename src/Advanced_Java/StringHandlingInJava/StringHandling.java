package Advanced_Java.StringHandlingInJava;

import java.util.Arrays;

public class StringHandling {
    public static void main(String[] args) {
        String str1 = "Ajinkya is Studying";
        String str2 = " in college.";
       // strings are immutable; it create new object reference

        System.out.println(str1.length());
        System.out.println(str2.length());

        String result = str1.concat(str2);
        System.out.println(result);

        // .format is used to supply dynamic values in string with %s
        String r =String.format("The name of Student is "+ "%s, and the age is  %d ", "Ajinkya",21);
        System.out.println(r);

        System.out.println(str1.charAt(6)); // 0 based index character array

        if(str1.equals(str2)){
            System.out.println("Same String");
        }
        else {
            System.out.println("Different String");
        }
        System.out.println(str1.indexOf('i'));

        System.out.println(str1.replace('y','k'));

        String[] arr = str1.split(" ");
        Arrays.asList(arr).forEach(s -> System.out.println(s));

        String newStr1 = str1.substring(0,5);
        System.out.println(newStr1);
    }
}
