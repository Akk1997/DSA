public class Binary {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 7, 8, 9 };
        int n = arr.length;
        int num = 7;
        int l = 0;
        int h = arr.length - 1;
        int result = binarySearch(arr, l, h, num);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);

    }

    public static int binarySearch(int arr[], int l, int h, int num) {
        if (h >= l) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == num)
                return mid;

            if (arr[mid] > num)
                return binarySearch(arr, l, mid - 1, num);

            return binarySearch(arr, mid + 1, h, num);
        }
        return -1;
    }

}
