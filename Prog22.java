class prog22 {
    public static void main(String args[]) {
        int[] arr = { 3, 2, 0, 5, 6, 7, 0, -1, 0, 6, 4, 0 };
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != 0) {
                i++;
                swap(arr, i, j);

            }
        }
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}