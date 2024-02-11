package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
      //  Map<String, Integer> numbers = new HashMap<>();
        Map<String,Integer> numbers = new TreeMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
        numbers.put("Five",5);
      /*  if(!numbers.containsKey("Two"))
        {
            numbers.put("Two",23);
        }*/
        numbers.putIfAbsent("Two",23);
        System.out.println(numbers);
      for (Map.Entry<String,Integer> e : numbers.entrySet()) {
          System.out.print(e);
          System.out.println();
          System.out.print(e.getKey());
          System.out.print(e.getValue());
      }
     for (String key: numbers.keySet())
     {
         System.out.println(key);
     }
        for (int value: numbers.values())
        {
            System.out.println(value);
        }

        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());
        numbers.remove("Three");
        System.out.println(numbers);
    }
}
