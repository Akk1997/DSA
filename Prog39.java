import java.util.*;

public class Prog39 {
    public static void main(String args[]) {
        Stack<Character> st = new Stack<>();
        String s = "AAakshaay";
        for (int i = 0; i < s.length(); i++) {
            if (st.isEmpty() || s.charAt(i) != st.peek()) {
                st.add(s.charAt(i));
            } else {
                st.pop();
            }

        }
        String a = "";
        while (!st.isEmpty()) {
            a = st.pop() + a;
        }
        System.out.println(a);

    }
}
