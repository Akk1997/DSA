public class Progr3 {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 7, 4, 2, 9, 6, 0 };
        int temp = 0;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] < temp) {
                arr[j] = arr[j - 1];
                j = j - 1;
                System.out.println(j);
            }
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
