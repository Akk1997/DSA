public class Prog7 {
    // Quick sort
    public static void main(String args[]) {
        int arr[] = { 5, 6, 8, 3, 4, 2, 6, 1 };
        sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void sort(int[] arr, int l, int h) {
        if (l < h) {
            int pi = quick(arr, l, h);
            sort(arr, l, pi - 1);
            sort(arr, pi + 1, h);
        }

    }

    public static int quick(int[] arr, int l, int h) {
        int pi = arr[h];
        int i = l;
        for (int j = l; j < h; j++) {
            if (arr[j] < pi) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[h];
        arr[h] = temp;
        return i;

    }

}
