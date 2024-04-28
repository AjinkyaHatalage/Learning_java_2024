package String;

/*Java String class provides a lot of methods to perform
        operations on strings such as compare(), concat(), equals(), split(), length(),
        replace(), compareTo(), intern(), substring() etc.

        The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.*/
public class LearnBasicString {
    public static void main(String[] args) {
        // string is immutable
         String s = "Ajinkya";
         s.concat("Hatalage");
        System.out.println(s);
        // but string create its new instance if it assigned
        s=s.concat("Hatalage");
        System.out.println("Here s is newly instantiated : "+ s );
        System.out.println("_________________________________");
    }
}
