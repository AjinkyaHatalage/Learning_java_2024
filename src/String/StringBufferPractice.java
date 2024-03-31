package String;
/*Java StringBuffer class is used to create mutable (modifiable) String objects.
The StringBuffer class in Java is the same as String class except it is mutable
i.e. it can be changed.*/
public class StringBufferPractice {
    public static void main(String[] args) {
       StringBuffer sb = new StringBuffer("Ajinkya ");

       sb.append("Hatalage");
        System.out.println(sb);

        sb.insert(0,"Anjali ");
        System.out.println(sb);

        sb.replace(0,sb.length(),"Ajinkya Ashok Hatalage");
        System.out.println(sb);

        sb.delete(0,sb.length());
        System.out.println("Deleted content in sb :"+sb);
       for(int i=0;i<100;i++){

           sb=sb.append(i+" ");
       }
        System.out.println(sb);

    }
}
