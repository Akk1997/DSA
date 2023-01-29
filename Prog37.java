import java.util.Stack;

public class Prog37 {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        int arr[] = { 1, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.peek());
        st.add(5, 67);
        System.out.println(st);
        if (st.contains(7)) {
            System.out.println(true);
        }
        System.out.println(st.size());
    }

}
