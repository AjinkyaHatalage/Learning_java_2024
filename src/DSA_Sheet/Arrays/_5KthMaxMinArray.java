package DSA_Sheet.Arrays;

import java.util.Arrays;

public class _5KthMaxMinArray {
    public static int solve(){
        int [] arr ={2,1,3,4,5,6,7};
        int k=3; // kth smallest
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        System.out.println(solve());
    }
}
