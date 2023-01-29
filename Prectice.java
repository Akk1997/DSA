class prectice {
    public static void main(String[] args) {

        int[] arr = { 1, 4, 2, 5, 3 };
        int sum = 0;
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            sum += (((i + 1) * (l - i) +
                    1) / 2) * arr[i];
            System.out.println(sum);
        }
        System.out.print(sum);
    }
}
