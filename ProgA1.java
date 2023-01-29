//import java.util.Scanner;
public class ProgA1 {
    public static void main(String args[]) {
        int a[] = { 4, 1, 2, 3 };
        int l = 0;
        int h = a.length - 1;
        sort(a, l, h);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void sort(int[] a, int l, int h) {

        while (l < h) {
            int m = l + (h - l) / 2;
            sort(a, l, m);
            sort(a, m + 1, h);
            merge(a, l, h, m);
        }

    }

    public static void merge(int[] a, int l, int h, int m) {
        int n1 = m + 1 - l;
        int n2 = h - m;
        int la[] = new int[n1];
        int ra[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            la[i] = a[l + i];
        }
        for (int i = 0; i < n2; i++) {
            ra[i] = a[m + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (la[i] > ra[j]) {
                a[k] = ra[j];
                j++;
            } else {
                a[k] = la[i];
                i++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = la[i];
            i++;
            k++;
        }
        while (j < n2) {
            a[k] = ra[j];
            j++;
            k++;
        }
    }

}
