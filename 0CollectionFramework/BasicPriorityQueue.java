import java.util.*;

public class BasicPriorityQueue {
    public static void main(String[] args) {
        // uses minHeap maxHeap
        // PriorityQueue<Integer> p = new PriorityQueue<>();
        // Queue<Integer> p = new PriorityQueue<>();
        Queue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());
        p.offer(37);
        p.offer(41);
        p.offer(18);
        p.offer(25);
        p.offer(26);
        p.offer(55);
        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p);
        System.out.println(p.peek());
    }
}
