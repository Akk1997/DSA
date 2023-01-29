import java.util.*;

public class Prog33 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            peakel(arr, n);
        }

    }

    public static void peakel(int arr[], int n) {
        int i = 0;
        int j = 2;
        int k = 1;
        while (j < n) {
            if (arr[k] > arr[i] && arr[k] > arr[j]) {
                System.out.println(arr[k]);
                break;

            } else {
                i++;
                j++;
                k++;
            }
        }
    }
}
