package Java_code_practice;

import java.util.Scanner;

public class RomanToIntegr {
    public static int romanToInt(String s) {

        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            } else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println("Enter Roman number to convert : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = romanToInt(s);
        System.out.println("Roman to Integr is : "+ ans);
    }

}
