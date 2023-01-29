import java.util.*;
public class p1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int i = 0;
        int j = st.length() - 1;
        int count = 0;
        while (i++ < j--) {
            if (st.charAt(i) != st.charAt(j)) {
                System.out.println("String is not pailindrome");
                break;
            }
            count++;
        }
        if (count == st.length() / 2 || count == st.length() / 2 - 1) {
            System.out.println("String is pillindrome");
        }

    }

}
