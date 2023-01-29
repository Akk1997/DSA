public class Prog43 {
    public static void main(String args[]) {
        int[] a = { 6, 1, 9, 2, 7 };
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > temp) {
                temp = a[i];
            }
        }
        System.out.print(temp);
    }
}
