import java.util.Scanner;

//check if element present in array using binary search
public class Prog4a {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        int f = s.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        sort(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        binse(arr, f, 0, n - 1);

    }

    public static void sort(int arr[], int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, h);
            merg(arr, l, mid, h);
        }
    }

    public static void merg(int[] arr, int l, int mid, int h) {
        int n1 = mid + 1 - l;
        int n2 = h - mid;
        int[] larr = new int[n1];
        int[] rarr = new int[n2];
        for (int i = 0; i < n1; i++) {
            larr[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            rarr[i] = arr[mid + i + 1];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]) {
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = larr[i];
            i++;
            k++;
        }
        while (i < n2) {
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }

    public static void binse(int arr[], int f, int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == f) {
                System.out.println("yes");
            } else if (arr[mid] > f) {
                binse(arr, f, mid + 1, h);
            } else {
                binse(arr, f, l, mid - 1);
            }
        } else {
            System.out.println("no");
        }
    }

}
