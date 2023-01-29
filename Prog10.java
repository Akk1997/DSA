import java.util.HashMap;

import java.util.*;

//Maximum freequency element using hashmap
public class Prog10 {
    public static void main(String args[]) {
        int[] arr = { 3, 5, 6, 4, 2, 5, 6, 7, 2, 2, 2, 2, 65, 7, 9, 7, 2, 5, 6, 7 };
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!m.containsKey(arr[i])) {
                m.put(arr[i], 1);
            } else {
                m.put(arr[i], m.get(arr[i]) + 1);
            }
        }
        int maxfeq = 0;
        int num = -1;
        /*
         * int a = 0;
         * for (int i : m.keySet()) {
         * 
         * if (m.get(i) > m.get(a)) {
         * a = i;
         * }
         * }
         * System.out.println(m.get(a));
         */
        Set<Integer> keyset = m.keySet();
        for (Integer i : keyset) {
            if (m.get(i) > maxfeq) {
                num = i;
                maxfeq = m.get(i);
            }

        }
        System.out.print(maxfeq + " is " + num);

    }

}
