import java.util.*;

public class prog32 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            pair(arr, n, k);
        }
    }

    public static void pair(int[] arr, int n, int k) {
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int val = k - arr[i];
            if (hs.contains(val)) {
                count++;
            }
            hs.add(arr[i]);
        }
        System.out.println(count);
    }
}
