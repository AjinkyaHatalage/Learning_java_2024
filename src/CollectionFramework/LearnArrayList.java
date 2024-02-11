package CollectionFramework;
import java.util.*;
public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String>studentName = new ArrayList<>();
        // size = n
        //       n + n/2 +1
       /* studentName.add("Ajinkya");
        System.out.println(studentName);
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,50);
        System.out.println(list);
        List<Integer>list1 = new ArrayList();
        list1.add(4);
        list1.add(5);

        list.addAll(list1);
        System.out.println(list);

        System.out.println(list.get(1));*/
        // both usuage we use for list
        // List<Integer>list = new ArrayList();
        List<Integer>list = new LinkedList<>();
        for(int i=1;i<+5;i++) {
            list.add(i*10);
        }
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

//        list.clear();
//        System.out.println("Empty List"+ list);

        list.set(2,1000);
        System.out.println(list);

        System.out.println(list.contains(500));
        for (int i = 0; i < list.size() ; i++) {
            System.out.println("The element  is : "+ list.get(i));
        }
        for (Integer element: list){
            System.out.println("foreach element is "+ element);
        }
        // iterator
        Iterator<Integer> it = list.iterator();
        // has next  give is  their any next element present
        while (it.hasNext()){
            System.out.println("iterator "+ it.next());
        }
    }
}
