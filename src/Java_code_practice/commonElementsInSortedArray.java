package Java_code_practice;

import java.util.ArrayList;

public class commonElementsInSortedArray {
    public static void main(String[] args) {

        int[] a1 = {10,17,28,38,90};
        int[] a2 = {10,17,29,47,58,90};
        int[] a3 = {10,17,28,38,90};
        ArrayList<Integer>ans = new ArrayList<>();
        int s1 = a1.length;
        int s2 = a2.length;
        int s3 = a3.length;


        int i=0,j=0,k=0;
        System.out.println("started");
        while (i < s1 && j < s2 && k < s3) {
            if (a1[i] == a2[j] && a2[j] == a3[k]) {
                ans.add(a1[i]);
                i++;
                j++;
                k++;
            } else if (a1[i] < a2[j]) {
                i++;
            } else if (a2[j] < a3[k]) {
                j++;
            } else {
                k++;
            }
        }
        System.out.println("Output is");
        for(int element : ans){
            System.out.print(element + " ");
        }

    }

}