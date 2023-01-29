import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Prog16 {
    // Arrey list implementation
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                al.add(i, s.nextInt());
            }
            // al.add(5);
            // al.add(6)
            Collections.sort(al);
            System.out.print(" initial List is :" + al + "\n");
            al.remove(3);
            al.set(2, 10);

            System.out.println("Final list is :" + al + "\n");
            System.out.print("Third element is" + al.get(2) + "\n");
        }

    }

}
