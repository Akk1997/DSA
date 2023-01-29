import java.util.Stack;
import java.util.*;

public class Prog41 {
    public static void main(String args[]) {
        int n = 1441;
        /*
         * int temp = n;
         * int rev = 0, rem;
         * while (temp != 0) {
         * rem = temp % 10;
         * rev = rev * 10 + rem;
         * temp = temp / 10;
         * }
         * if (rev == n) {
         * System.out.println("Is pallindrome");
         * } else {
         * System.out.println("Not pallendrome");
         * }
         */
        Stack<Character> st = new Stack<>();
        String arr = "AKKA";
        // String s = String.valueOf(n);
        // char[] arr = s.toCharArray();
        /*
         * for (int i = 0; i < arr.length(); i++) {
         * st.push(arr.charAt(i));
         * }
         * String rev = "";
         * while (!st.isEmpty()) {
         * rev = st.pop() + rev;
         * }
         * System.out.println(rev);
         * if (rev.equals(arr)) {
         * System.out.println("Yes");
         * } else {
         * System.out.println("NO");
         * }
         */
        st.push(arr.charAt(0));
        System.out.println(st);
        for (int i = 1; i < arr.length() - 1; i++) {
            if (st.peek() == arr.charAt(i)) {
                st.pop();
            }
            if (!st.contains(arr.charAt(i))) {
                st.push(arr.charAt(i));
            }
        }
        System.out.println(st);

    }
}
