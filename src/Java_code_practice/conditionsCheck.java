package Java_code_practice;

import java.util.Scanner;

public class conditionsCheck {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter No : ");

        int choice = sc.nextInt();
        if (choice == 0) {
            System.out.println("0");
            fun();
        } else if (choice == 1) {
            System.out.println("1");
            switch_case(choice);
        } else {
            System.out.println("end");
        }
    }
    public static void switch_case(int choice){
        switch (choice){
            case 0 :
                System.out.println("0");
                break;
            case 1 :
                System.out.println("1");
                break;
            default:
                System.out.println("default");
        }
    }
    public static void fun(){

        for (int i = 0; i < 10; i++) {
            System.out.println("Inside for");
            System.out.println("Value is : " + i);
        }
        int i = 0;
        while (i > -3) {
            System.out.println("Inside While");
            System.out.println("Value is : " + i);
            i--;
        }
    }
}
