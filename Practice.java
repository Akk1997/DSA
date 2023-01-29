
class Practice {
    public static void main(String args[]) {
        // Scanner s =new Scanner(System.in);
        // int n =s.nextInt();
        int[] arr = { 6, 7, 5, 8, 3, 9, 2, 1 };
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; i++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}