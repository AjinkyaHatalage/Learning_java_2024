package DSA_Sheet.Arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class _7ICommonElementIn3SortedArrays {

    public static void solve(int [] a1,int [] a2,int [] a3){
        HashSet<Integer>hashSet = new HashSet<>();
        ArrayList<Integer>arrayList = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i=0;i<a1.length;i++){
            hashSet.add(a1[i]);
        }
        for (int i=0;i<a2.length;i++){
            if(hashSet.contains(a1[i])){
                arrayList.add(a2[i]);
            }
        }
        for (int i=0;i<a3.length;i++){
            if(arrayList.contains(a3[i])){
                ans.add(a2[i]);
            }
        }
        for (int val : ans){
            System.out.print(val+" ");
        }
    }
    public static void main(String[] args) {
        int [] a1 = {1,2,3,4,5,6};
        int [] a2 = {1,2,3,5};
        int [] a3 = {1,2,6};
        solve(a1,a2,a3);
    }

/*
   Other optimal soln is this

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
*/

}
