package DSA_Sheet.Arrays;

public class _3Sort012Array {
    public static void main(String[] args) {
        int [] arr = { 0,1,0,1,0,2,0,1};
        int cnt0=0,cnt1=0,cnt2=0;
        for(int i:arr){
            if(i==0){
                cnt0++;
            }
            if(i==1){
                cnt1++;
            }
            if(i==2){
                cnt2++;
            }
        }
        int k =0;
        while (cnt0>0){
            arr[k++]=0;
            cnt0--;
        }
        while (cnt1>0){
            arr[k++]=1;
            cnt1--;
        }
        while (cnt2>0){
            arr[k++]=2;
            cnt2--;
        }
        for (int i:arr){
            System.out.print(" "+i);
        }
    }
}
