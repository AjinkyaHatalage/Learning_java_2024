package AlgorithmsJava;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Searching {

    public static int Linear_search(int[] arr,int finder){
        for(int i:arr){
            if(finder == arr[i]){
                return i;
            }
            else {
                return -1;
            }
        }
        return 0;
    }
    public static int Binary_search(int [] arr, int finder){
        Arrays.sort(arr);
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==finder){
                return mid;
            }
            if (arr[mid]<finder)
            {
               start=start+1;
            }
            if (arr[mid]>finder)
            {
                end = end -1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
      int[] arr = {2,3,4,1,3,4,5,6,9};
      int result = Linear_search(arr,8);
      if(result == -1){
          System.out.println("Element is absent");
      }
      else {
          System.out.println("Element is present");
      }
      int result1= Binary_search(arr,9);
      if(result1 == -1){
          System.out.println("Element is absent in \" Binary Search\"  ");
      }
      else{
          System.out.println("Element is present in \"binary Search\" ");
      }
    }
}
