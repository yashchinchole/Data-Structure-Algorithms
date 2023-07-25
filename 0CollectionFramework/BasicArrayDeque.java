import java.util.*;

public class BasicArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(18);
        ad.offer(25);
        ad.offer(26);
        ad.offerFirst(37);
        ad.offerLast(41);
        System.out.println(ad);
        
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad);
        
        System.out.println(ad.poll());
        System.out.println(ad.pollFirst());
        System.out.println(ad.pollLast());
        System.out.println(ad);

    }
}
