package Advanced_Java.Enumration;

import Advanced_Java.Enumration.colorEnum;

import java.awt.*;

public class EnumrationInJava {

   /*An enumeration (enum for short) in Java is a special data type which contains a
    set of predefined constants. You'll usually use an enum when dealing with values
    that aren't required to change,  like days of the week, seasons of the year, colors,
     and so on.*/
    public static void main(String[] args) {
        colorEnum c1 = colorEnum.RED;

        System.out.println("Red Enum name : "+ c1.name());
        System.out.println("Red Enum value :"+c1.getValue());

        for (colorEnum color : colorEnum.values()){
            System.out.println("Enum values "+ color.getValue());
        }
    }
}
