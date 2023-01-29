import java.util.*;

public class Prog15 {
    // longest subarray with sum zero
    public static void main(String afrgs[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            int k = 0;
            // System.out.print(arr[5]);
            /*
             * Map<Integer, Integer> hm = new HashMap<>();
             * for (int i = 0; i < arr.length; i++) {
             * hm.put(i, arr[i]);
             * }
             * int sum = 0;
             * int count = 0;
             * for (int i = 0; i < arr.length; i++) {
             * sum += hm.get(i);
             * count++;
             * if (sum == 0) {
             * System.out.print(count);
             * break;
             * }
             * }
             */
            maxSub(arr, n, k);
        }

    }

    public static void maxSub(int[] arr, int n, int k) {
        int sum = 0;
        int result = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println(sum);
            if (sum == k) {
                result = i + 1;
            }
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
            if (hm.containsKey(sum - k)) {
                if (result < (i - hm.get(sum - k))) {
                    result = i - hm.get(sum - k);
                }
            }
        }
        System.out.println(result);

    }

}
