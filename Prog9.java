
import java.util.*;

//Binary search
public class Prog9 {
    public static void main(String args[]) {
        int arr[] = { 5, 6, 4, 9, 6, 3, 2 };
        int k = 3;
        Arrays.sort(arr);
        int l = 0, h = arr.length - 1;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == k) {
                System.out.println("element " + k + "present at");
            }
            if (arr[mid] > k) {
                h = mid;
            } else {
                l = mid + 1;
            }

        }
    }

}
