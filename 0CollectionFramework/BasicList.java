import java.util.*;

public class BasicList {
    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("YASH");
        l1.add("CHINCHOLE");
        System.out.println(l1);

        List<String> l2 = new ArrayList<>();
        l2.add("OPENAI");
        l2.add("GITHUB");
        l2.add("MICROSOFT");
        l2.add("AMAZON");
        l2.add("GOOGLE");
        l2.add("CRED");
        System.out.println(l2);

        // l1.addAll(l2);
        l2.addAll(2, l1);
        System.out.println(l2);

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(37);
        l3.add(10);
        l3.add(20);
        l3.add(30);
        l3.add(40);
        l3.add(50);
        l3.add(30);
        System.out.println(l3);

        l3.remove(0);
        System.out.println(l3);
        l3.remove(Integer.valueOf(30));
        System.out.println(l3);
        // l3.clear();
        System.out.println(l3);

        List<Integer> l4 = new LinkedList<>();
        l4.add(10);
        l4.add(20);
        l4.add(30);
        l4.add(40);
        l4.add(50);
        System.out.println(l4);
        System.out.println(l4.contains(37));
        
        l4.set(2, 37);
        System.out.println(l4);
        System.out.println(l4.contains(37));
        
        System.out.println(l4);
        
        for (int i = 0; i < l4.size(); i++)
            System.out.println("For Loop " + l4.get(i));

            for (Integer i : l4)
            System.out.println("For Each Loop " + i);

            Iterator<Integer> it = l4.iterator();
        while (it.hasNext())
        System.out.println("Iterator " + it.next());

        System.out.println(Collections.min(l4));
        System.out.println(Collections.max(l4));
        System.out.println(Collections.frequency(l4, 10));
        Collections.sort(l4);
        System.out.println(l4);
        Collections.sort(l4, Comparator.reverseOrder());
        System.out.println(l4);
    }
}
