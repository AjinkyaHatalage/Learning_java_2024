package Java_code_practice;

import java.util.Scanner;

public class AddtwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a := ");
        int a = sc.nextInt();
        System.out.println("Enter b := ");
        int b = sc.nextInt();
        System.out.println("Sum is : = "+ (a+b) );
        System.out.println("Mul is : = "+ (a*b));
        System.out.println("Sub is : = "+ Math.abs(a-b));
        System.out.println("Mod is := "+(a%b));
        System.out.println("Div is := "+ (a/b));
    }
}
