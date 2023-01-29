import java.util.*;

//Finding the pair sum 
public class Prog31 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == k) {
                        System.out.print(arr[i] + " " + arr[j]);
                    }
                }
                System.out.println();
            }
        }
    }

}
