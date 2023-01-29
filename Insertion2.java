public class Insertion2 {
    public static void main(String args[]) {
        int arr[] = { 9, 16, 7, 12, 5, 11 };
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int currentElement = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] >= currentElement) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = currentElement;
        }
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
    }

}
