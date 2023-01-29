import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.*;
//hashmap implementation

public class Prog8 {
    /**
     * @param args
     */
    public static void main(String args[]) {
        // int arr[] = { 1, 5, 4, 3, 6, 7, 8, 9, 10, 8, 3 };
        Map<Integer, Integer> hm = new HashMap<>();
        /*
         * for (int i = 0; i < arr.length; i++) {
         * hm.put(arr[i], i);
         * }
         */

        hm.put(1, 0);
        hm.put(2, 5);
        hm.put(3, 5);
        hm.put(3, 9);
        hm.put(4, 8);
        hm.put(4, 88);
        hm.put(6, 8);
        hm.put(9, 9);
        hm.put(8, 10);

        // hm.remove(5);
        if (hm.containsKey(7)) {
            System.out.println("Contains " + "\n");
        }
        System.out.print("hashmap :" + hm + "\n");
        for (Integer i : hm.keySet()) {
            System.out.print(i + " ");
            // System.out.println(hm.get(i));

        }
        System.out.println();
        System.out.println(hm.size());
        Map<Integer, Integer> ak = new HashMap<>(hm);
        System.out.println("Ak :" + ak + "\n");
        Iterator<Entry<Integer, Integer>> iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<Integer, Integer> e = iterator.next();
            System.out.print(e.getKey() + " ");
            System.out.println();
            System.out.print(e.getValue() + " ");
        }

    }
}
