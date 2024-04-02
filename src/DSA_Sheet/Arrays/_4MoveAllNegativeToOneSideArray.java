package DSA_Sheet.Arrays;

public class _4MoveAllNegativeToOneSideArray {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        int[] newArr = new int[arr.length];
        int j=0;
        for(int i:arr){
            if(i<0){
              newArr[j++]=i;
            }
        }
        for(int i:arr){
            if(i>=0){
                newArr[j++]=i;
            }
        }
        for (int i:newArr){
            System.out.print(i+" ");
        }
    }
}
