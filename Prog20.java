import java.util.Scanner;

public class Prog20 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[] arr = new int[m];
            int[] arr1 = new int[n];
            for (int i = 0; i < m; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr1[i] = s.nextInt();
            }
            sort(arr, arr1, n, m);
        }

    }

    public static void sort(int[] arr, int[] arr1, int n, int m) {
        int i = 0;
        int j = 0;
        int k = 0;
        int temp[] = new int[n];

        for (int a = 0; a < n; a++) {
            if (arr[i] < arr1[j]) {
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr1[j];
                j++;
            }
            k++;
        }
        for (int c = 0; c < n; c++) {
            System.out.println(temp[c] + " ");
        }

    }

}
