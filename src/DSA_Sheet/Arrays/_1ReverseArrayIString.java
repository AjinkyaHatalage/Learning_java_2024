package DSA_Sheet.Arrays;

public class _1ReverseArrayIString {
    public static String solve(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString().toLowerCase();
    }
    public static void main(String[] args) {
        String s = "Ajinkya Hatalage";
        System.out.println(solve(s));

    }
}
