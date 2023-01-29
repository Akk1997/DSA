import java.util.*;

public class Prog4 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int k = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            sort(arr, 0, arr.length - 1);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            int res = sear(arr, 0, arr.length - 1, k);
            if (res == -1) {
                System.out.println("element is not persent in list");
            } else {
                System.out.println("Element is persent at index " + res);
            }
            System.out.println("Second largest element of array is " + arr[arr.length - 2]);
        }
    }

    public static void sort(int[] arr, int l, int h) {
        if (l < h) {
            int mid = l + (h - l) / 2;
            sort(arr, l, mid);
            sort(arr, mid + 1, h);
            merg(arr, h, mid, l);
        }
    }

    public static void merg(int arr[], int h, int mid, int l) {
        int n1 = mid + 1 - l;
        int n2 = h - mid;
        int[] arrleft = new int[n1];
        for (int i = 0; i < n1; i++) {
            arrleft[i] = arr[l + i];
        }
        int[] arrRight = new int[n2];
        for (int i = 0; i < n2; i++) {
            arrRight[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (arrRight[j] >= arrleft[i]) {
                arr[k] = arrleft[i];
                i++;
            } else {
                arr[k] = arrRight[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = arrleft[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = arrRight[j];
            k++;
            j++;
        }

    }

    public static int sear(int[] arr, int l, int h, int k) {
        if (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == k) {
                return mid;

            }
            if (arr[mid] > k) {
                return sear(arr, l, mid, k);
            }
            if (arr[mid] < k) {
                return sear(arr, mid + 1, h, k);
            }
        }
        return -1;

    }

}
