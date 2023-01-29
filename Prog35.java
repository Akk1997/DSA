import java.util.HashMap;

public class Prog35 {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 9;
        triplet(arr, k);

    }

    public static boolean triplet(int arr[], int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length - 2; i++) {
            int cc = k - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int c = cc - arr[j];
                if (hm.containsKey(c)) {
                    // int count = hm.get(c);
                    System.out.println(arr[i] + " " + arr[j] + " " + c);
                    return true;

                } else if (!hm.containsKey(arr[j])) {
                    hm.put(arr[j], 1);
                    // System.out.println((arr[j]));
                } else {
                    hm.put(arr[j], hm.get(arr[j]) + 1);
                    // System.out.println(arr[j]);
                }
            }
        }
        return false;
    }

}
