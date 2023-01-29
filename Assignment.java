import java.util.Scanner;

public class Assignment {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter a sentance");
            String sen = s.nextLine();
            System.out.println("Enter a Letter");
            char ch = s.next().charAt(0);
            // System.out.println("Submit");
            char[] arr = sen.toCharArray();
            int temp = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == ch) {
                    temp = i;
                    break;
                }
            }
            for (int i = temp + 1; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
        }
    }

}
