package Java_code_practice;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr= {3,2,4,55,6,4,3,42,2};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
         sum +=arr[i];

        }
        System.out.println(sum);

    }
}
