import java.util.*;

public class BasicSet {
    public static void main(String[] args) {
        // Set<Integer> hs1 = new HashSet<>();
        // hs1.add(37);
        // hs1.add(18);
        // hs1.add(25);
        // hs1.add(37);
        // hs1.add(26);
        // hs1.add(41);
        // System.out.println(hs1);

        // hs1.remove(41);
        // System.out.println(hs1);
        // System.out.println(hs1.contains(55));

        // System.out.println(hs1.size());
        // System.out.println(hs1.isEmpty());

        // Set<Integer> hs2 = new LinkedHashSet<>();
        // hs2.add(37);
        // hs2.add(18);
        // hs2.add(25);
        // hs2.add(37);
        // hs2.add(26);
        // hs2.add(41);
        // System.out.println(hs2);

        // hs2.remove(41);
        // System.out.println(hs2);
        // System.out.println(hs2.contains(55));

        // System.out.println(hs2.size());
        // System.out.println(hs2.isEmpty());

        // Binary Search Tree
        Set<Integer> hs3 = new TreeSet<>();
        hs3.add(37);
        hs3.add(18);
        hs3.add(25);
        hs3.add(37);
        hs3.add(26);
        hs3.add(41);
        System.out.println(hs3);

        hs3.remove(41);
        System.out.println(hs3);
        System.out.println(hs3.contains(55));

        System.out.println(hs3.size());
        System.out.println(hs3.isEmpty());
    }
}
