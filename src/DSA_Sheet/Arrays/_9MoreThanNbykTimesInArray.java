package DSA_Sheet.Arrays;

import java.util.HashMap;

public class _9MoreThanNbykTimesInArray {
    public static void solve(int []a1 , int k){
        int divider = a1.length / k;
        System.out.println("Divider : "+ divider);
        HashMap<Integer,Integer> hashMap = new HashMap();
        for(int i : a1){
           if(hashMap.containsKey(i)){
               hashMap.put(i, hashMap.get(i)+1);
           }
           else{
               hashMap.put(i, 1);
           }
        }
        System.out.println("________________");
        System.out.print(hashMap);
        System.out.println("________________");
        for (int values : hashMap.keySet()){
           if(divider <= hashMap.get(values)){
               System.out.print(values + " ");
           }
        }
    }
    public static void main(String[] args) {
        int []arr = {1,2,4,2,4,1,4,1,4,6,6};
        System.out.print("Original Array");
        for(int i : arr){
            System.out.print(i + " ");
        }
        int k=5;
        System.out.println("Soln  Array");
        solve(arr,k);
    }
}
