import java.util.*;

public class Prog13 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            int out = mapping(arr, n);
            if (out == 0) {
                System.out.print(-1);
            } else {
                System.out.print(out);
            }
        }

    }

    public static int mapping(int arr[], int n) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);

            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }

        }
        int tmp = 0;
        int co = 0;

        Set<Integer> a = hm.keySet();
        for (Integer i : a) {
            int bc = 0;
            if (hm.get(i) > (n / 2))
                bc = hm.get(i);
            if (bc > co) {
                co = bc;
                tmp = i;
            }
        }
        return tmp;
    }
}

/*
 * =for (int i = 0; i < arr.length; i++) {
 * int count = 0;
 * for (int j = 0; j < arr.length; j++) {
 * if (arr[i] == arr[j]) {
 * count++;
 * }
 * }
 * if (count > temp) {
 * temp = count;
 * el = arr[i];
 * }
 * }
 * if (temp > (n / 2)) {
 * System.out.print(el);
 * } else {
 * System.out.println(-1);
 * }
 */
// }

// }
