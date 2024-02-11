package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // inserts the specified element into queue.
        pq.add(40);
        // If the task is successful, offer() returns true,if not return false
        pq.offer(43);
        pq.offer(12);
        pq.offer(54);
        System.out.println(pq);
        // by default it is min heap
        // when we use Comparator.reverseOrder() it is max heap
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
