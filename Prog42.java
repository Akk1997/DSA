public class Prog42 {
    public static void main(String args[]) {
        int[] arr = { 13, 14, 15, 19, 21 };
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i != temp) {
                while (temp < arr[i] - i) {
                    System.out.println(temp + i + " ");
                    temp++;
                }
            }
        }

    }

}
