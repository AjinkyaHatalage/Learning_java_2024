package Java_code_practice;

public class CountNumberOfWordsInString {
    public static void main(String[] args) {
        String words = "One Two Three Four";
        int countwords=words.split("\\s").length;
        System.out.println(countwords);
    }

}
