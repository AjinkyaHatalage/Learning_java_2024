package CollectionFramework;

import java.util.Arrays;

public class LearnArrayClass {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int index = Arrays.binarySearch(numbers,4);
        Arrays.fill(numbers,12);
        System.out.println("The Index of element 4 in the array :"+index);

        int [] unsorted = {312,12,32,1,2,432,123,14,53};
        Arrays.sort(unsorted);
       for(int i : unsorted){
           System.out.print(i + " ");
       }
    }
}
