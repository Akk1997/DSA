import java.util.*;

public class Prog1a {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(" Initial array is");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int str = 0;
        int end = arr.length - 1;
        while (end >= str) {
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;
            end--;
            str++;
        }
        System.out.println("FInal array is");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
