package CollectionFramework;

import java.util.*;

public class LearnCollectionClass {
    public static void main(String[] args) {
        List<student> list = new ArrayList<>();
        list.add(new student("Anuj",3));
        list.add(new student("Ramesh",4));
        list.add(new student("Shivam",3));
        list.add(new student("Rohit",1));

        student s1 = new student("Anuj",2);
        student s2 = new student("Rohit",3);
        Collections.sort(list);

        System.out.println(s1.compareTo(s2));

        System.out.println(list);

        Collections.sort(list, new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.name.compareTo(o2.name);
            }
        });


     /*   List<Integer>list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(0);
        list.add(9);
        list.add(100);
        System.out.println("Min element "+ Collections.min(list));
        System.out.println("Max Element "+ Collections.max(list));
        System.out.println(Collections.frequency(list,9));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.print(list);*/
    }
}
