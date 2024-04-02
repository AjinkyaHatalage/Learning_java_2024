package DSA_Sheet.Arrays;

public class _2MaxMinSumArray {
    public static void main(String[] args) {
        int [] arr = { 1,4,-6,2,100,-99};
      int max=arr[0],min = arr[0];
       for(int element: arr){
           if(element < min){
               min=element;
           }
           if(element > max){
               max=element;
           }
       }
        System.out.println("max : "+max + " min :"+min + " Sum : max+ min = "+ (max+min));
    }
}
