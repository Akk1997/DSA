import java.util.Scanner;

public class Practice2 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < arr.length - 1; i++) {
                int m = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[m] > arr[j]) {
                        m = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[m];
                arr[m] = temp;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
