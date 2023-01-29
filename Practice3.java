public class Practice3 {
    public static void main(String args[]) {
        int arr[] = { 5, 1, 3, 4, 5, 6, 3 };
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
