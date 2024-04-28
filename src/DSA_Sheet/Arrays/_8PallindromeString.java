package DSA_Sheet.Arrays;

import java.util.Scanner;

public class _8PallindromeString {
    public static void main(String[] args) {
        System.out.println("Enter the String want to check Pallindrome or not : ");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 ="";
        StringBuilder stringBuilder = new StringBuilder(s1);
        s2 += stringBuilder.reverse();
        if(s1.equals(s2)){
            System.out.println("Paliindrome");
        }
        else {
            System.out.println("Not Pallindrome");
        }
/*
      Another solution for same

        String input = "abba";
        int i=input.length();
        System.out.println(i);
        String rev = "";
        for(int j=i-1;j>=0;j--){
            rev+=input.charAt(j);
        }
        if(input.equals(rev)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }*/

    }

}
