import java.util.*;

public class BasicQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        // throws exception if not able to add
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        System.out.println(q1.peek());
        System.out.println(q1);
        // Not throws exception if not able to add
        q1.offer(18);
        q1.offer(25);
        q1.offer(37);
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);
        // Not throws exception if queue is empty return null
        System.out.println(q1.peek());
        // throws exception if queue is empty
        System.out.println(q1.element());

    }
}
