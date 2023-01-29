class new1 {
    public static void main(String args[]) {
        // Scanner s =new Scanner(System.in);
        // int n =s.nextInt();
        int[] arr = { 1, 1, 2, 2, 2, 2, 3, 4, 6, 8 };
        int i = 1;
        int j = arr.length - 1;
        int target = 2;

        while (i < j) {
            if (arr[i] == target) {
                System.out.println(i);
                break;
            } else {
                i++;
            }
        }
        while (j > i) {
            if (arr[j] == target) {
                System.out.println(j);
                break;
            } else {
                j--;
            }

        }
    }
}
