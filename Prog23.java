public class Prog23 {
    public static void main(String args[]) {
        int arr1[] = { 1, 3, 5, 7, 9 };
        int arr2[] = { 2, 4, 6, 8 };
        int n = arr2.length;
        int m = arr1.length;
        for (int i = n - 1; i >= 0; i--) {

            int j, last = arr1[m - 1];
            for (j = m - 2; j >= 0 && arr1[j] > arr2[i]; j--)
                arr1[j + 1] = arr1[j];

            // If there was a greater element
            if (last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
            for (int k = 0; k < arr2.length; k++) {
                System.out.print(arr2[k] + " ");
            }
            System.out.println();

        }
    }
}
