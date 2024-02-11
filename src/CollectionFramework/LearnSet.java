package CollectionFramework;

import java.util.*;

public class LearnSet {
    public static void main(String[] args) {
       Set<student> studentSet = new HashSet<>();
       studentSet.add(new student("Ajinkya",30));
       studentSet.add(new student("Anjali",40));
       studentSet.add(new student("Asmita",12));
        studentSet.add(new student("Asmita",12));
        studentSet.add(new student("Anuj",12));
        System.out.println(studentSet);

       // Set<Integer> set = new HashSet<>();
      //  Set<Integer>set = LinkedHashSet<>();
      /*  Set<Integer>set = new TreeSet<>();

        set.add(34);
        set.add(2);
        set.add(5);
        set.add(5);
        set.add(5);
        set.add(31);
        set.add(31);
        set.add(66);
        System.out.println(set);

        set. remove(31);
        System.out.println(set);

        System.out.println(set.contains(6));
        System.out.println(set.contains(66));
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);*/
        /*
        Output :
[34, 2, 66, 5, 31]
[34, 2, 66, 5]
false
true
4
false
[]

         */
    }
}
