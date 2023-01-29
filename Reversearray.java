class Reversearray {
    public static void main(String args[]) {
        int arr[] = { 2, 4, 3, 6, 7, 21 };
        int i = 0;
        int j = arr.length - 1;
        System.out.println("Initial array is -");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println();
        System.out.println("Final array Is-");
        for (int b : arr) {
            System.out.print(b + " ");
        }

    }
}
