package String;

public class StringBuilderClass {
    public static void main(String[] args) {
      /*  Java StringBuilder class is used to create mutable (modifiable) String.
        The Java StringBuilder class is same as StringBuffer
        class except that it is non-synchronized. It is available since JDK 1.5.*/

        StringBuilder stringBuilder = new StringBuilder("Ajinkya");
         stringBuilder.append("Hatalage");
         stringBuilder.append("@");
         stringBuilder.append("niceactimize");
         stringBuilder.append(".");
         stringBuilder.append("com");
        System.out.println(stringBuilder);
    }
}
