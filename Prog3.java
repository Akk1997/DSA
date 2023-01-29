class prectice1 {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 5, 3 };
        int sum = 0;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = i; j < l; j += 2) {
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
            }
        }
        System.out.print(sum);
    }
}