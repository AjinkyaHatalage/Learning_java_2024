package CollectionFramework;
import java.util.*;
public class LearnStack {
    // push , pop ,peek
    public static void main(String[] args) {
      Stack<String> animals = new Stack<>();
      animals.push("Lion");
      animals.push("Tiger");
      animals.push("Cat");
      animals.push("Horse");

        System.out.println("Stack "+ animals);
        System.out.println(animals.peek());
        System.out.println(animals.pop());
        System.out.println(animals.peek());
    }
}
