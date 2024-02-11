package Java_code_practice;

public class ReverseAString {
    public static void main(String[] args) {
        /*String Orignal_s = "Hello";
        String Reverse_s ="";
        for (int i=0;i<Orignal_s.length();i++)
        {
            Reverse_s =Orignal_s.charAt(i)+ Reverse_s;
            System.out.println(Reverse_s);
        }
        System.out.println(Reverse_s);*/

        String s_name = "Ajinkya";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s_name);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
