import java.util.*;

public class Prog34 {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 1, 1 };
        int k = 2;
        pair(arr, k);

    }

    public static void pair(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int b = k - arr[i];
            if (hm.containsKey(b)) {
                count = hm.get(b);
                // System.out.println(b);
                for (int j = 0; j < count; j++) {
                    System.out.print("(" + arr[i] + " " + b + ")" + " ");
                }
                // return true;
            }
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        // System.out.println(count);
        // return false;

    }

}
