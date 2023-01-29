//import java.util.Stack;
// Peak element 
public class prog36 {
    public static void main(String args[]) {
        int arr[] = { 7, 2, 3, 5, 4, 6, 7, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            // int l = i-1;
            int m = i + 1;
            if (arr[i] > arr[i + 1] && i == 0) {
                System.out.println(arr[i]);
            } else if (arr[i] < arr[m] && i == arr.length - 2) {
                System.out.print(arr[m]);
                break;
            } else if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(arr[i]);

            }
        }

    }
}
