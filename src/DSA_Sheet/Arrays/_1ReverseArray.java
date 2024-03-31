package DSA_Sheet.Arrays;

import java.util.Scanner;

public class _1ReverseArray {
    public static void main(String[] args) {
        int[] arr ={3,2,31,1,31,4,1};
        int start=0;int end=arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println("Arr Elements :"+ arr[i]);
        }
    }
}
