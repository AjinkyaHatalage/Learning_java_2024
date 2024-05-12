package Advanced_Java.RegularExpressionsInJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {
    public static void main(String[] args) {
        String regStr = ".*[a-z][0-9][a-z]]";
        Pattern pattern = Pattern.compile(regStr);

        Matcher matcher = pattern.matcher("1234233561367fadj135612");
        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("Match found");
        }
        else {
            System.out.println("Match not found");
        }
    }
}
