import java.util.*;

public class Prog5 {
    public static void main(String args[]) {
        int[] arr = { 6, 4, 3, 2, 6, 7, 7, 6, 4, 5 };
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i : arr) {
            if (!hm.containsKey(i)) {
                hm.put(i, 1);
            } else {
                hm.put(i, hm.get(i) + 1);
            }
        }
        for (Integer i : hm.keySet()) {
            if (hm.get(i) > 1) {
                System.out.println("Dublicate element is " + i);
            }
        }

    }

}
