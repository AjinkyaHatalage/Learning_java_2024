package DSA_Sheet.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class _6UnionIntersectionArray {
    public static void Solution(int [] a1,int [] a2){
        HashSet<Integer> hashSet = new HashSet<>();
        ArrayList<Integer> arrayListInter = new ArrayList<>();

        for(int i=0;i<a1.length;i++){
            hashSet.add(a1[i]);
        }

        for (int i=0;i<a2.length;i++){
            if(hashSet.contains(a2[i])){
                arrayListInter.add(a2[i]);
            }
        }
        for (int values : arrayListInter){
            System.out.print(values+" ");
        }
        System.out.println("Intersection End");
        System.out.println("Union Start");
        for(int i=0 ; i< a2.length ;i++){
            hashSet.add(a2[i]);
        }
        for(int val : hashSet){
            System.out.print(val+" ");
        }
        System.out.println("Union End");


    }
  /* public static void Union(int [] a1,int [] a2){
        HashMap<Integer,Integer>hashMap = new HashMap<>();
        for(int i=0;i<a1.length;i++){
            if(hashMap.containsKey(a1[i])){
                hashMap.put(a1[i], hashMap.get(a1[i])+1);
            }
            else {
                hashMap.put(a1[i], 1);
            }
        }
        for(int i=0;i<a2.length;i++){
            if(hashMap.containsKey(a2[i])){
                hashMap.put(a2[i], hashMap.get(a2[i])+1);
            }
            else {
                hashMap.put(a2[i], 1);
            }
        }
       System.out.println("Hash start");
       for(int keyset : hashMap.keySet()){
           System.out.print(keyset+ " ");
       }
       System.out.println(" ");
       for (int key : hashMap.values()) {

               System.out.print(key + " ");
       }
       System.out.println("Hash end -> Interstion output is below");
       for (int key : hashMap.values()) {
           if (key > 1){
               System.out.print(hashMap.keySet() + " ");
           }
       }

    }
    */
    public static void main(String[] args) {
        int []arr1 ={1,2,3,4,5,6,1};
        int []arr2={2,3,4,5,6,7,8,8};
        Solution(arr1,arr2);
        System.out.println("______________________________________");

    }
}
