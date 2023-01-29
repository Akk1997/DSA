import java.util.*;

public class Prog12 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int m = s.nextInt();
            int[][] arr = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = s.nextInt();
                }
            }
            int max1 = max(arr, m, n);
            System.out.print(max1);
        }

    }

    public static int max(int arr[][], int m, int n) {
        // int temp = 0;
        int raw = 0;
        // for (int i = 0; i < m; i++) {
        // int count = 0;
        for (int j = 0; j < m; j++) {
            if (arr[j][0] == 1) {
                // count = j;
                // i++;
                raw = j;

            }
        }
        // if (count < temp) {
        /// temp = count;
        // raw = i;
        // }
        // }
        if (raw == 0) {
            return -1;
        }
        return raw;
    }

}
