import java.util.*;

public class BasicHashMap {
    public static void main(String[] args) {
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("YASH", 1);
        m1.put("GOOGLE", 1);
        m1.put("OPENAI", 2);
        m1.put("GITHUB", 3);
        m1.put("YASH", 5);
        m1.putIfAbsent("YASH", 10);
        System.out.println(m1);

        for (Map.Entry<String, Integer> e : m1.entrySet())
            System.out.println(e + " " + e.getKey() + " " + e.getValue());

        for (String key : m1.keySet())
            System.out.println(key);

        for (Integer value : m1.values())
            System.out.println(value);

         System.out.println(m1.isEmpty());   
         System.out.println(m1.containsKey("YASH"));
         System.out.println(m1.containsValue(1));

    }
}
