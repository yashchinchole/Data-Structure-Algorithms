import java.util.*;

public class BasicStack {
    public static void main(String[] args) {

        Stack<String> s1 = new Stack<>();
        s1.push("YASH");
        s1.push("CHINCHOLE");
        System.out.println(s1);

        Stack<String> s2 = new Stack<>();
        s2.push("OPENAI");
        s2.push("GITHUB");
        s2.push("MICROSOFT");
        s2.push("AMAZON");
        s2.push("GOOGLE");
        s2.push("CRED");
        System.out.println(s2.peek());
        System.out.println(s2);
        s2.pop();
        s2.pop();
        System.out.println(s2.pop());
        System.out.println(s2);
        System.out.println(s2.peek());
    }
}
