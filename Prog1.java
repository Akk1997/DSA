class Main {
    public static void main(String args[]) {
        int[] arr = { 1, -2, 6, 7, 3, -4, -6 };
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] > 0) {
                swap(arr, i, j);
                i++;
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}