package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedlistQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // inserts the  specified element into the queue.
        // if task is successful,add() returns true, if not it throws an exception
        queue.add(40);
        // inserts the specified element into queue.
        // If the task is successful, offer() returns true,if not return false
        queue.offer(12);
        queue.offer(43);
        queue.offer(54);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        // element() - retuens the head of the queue. Throws an exception if the queue is empty

    }
}
