import java.util.Scanner;

public class Prog29 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            op l = new op();

            for (int i = 0; i < n; i++) {
                l.add(s.nextInt());
            }
            System.out.println("The list is ");
            l.print();
            System.out.println("enter new head");
            int m = s.nextInt();
            l.addhead(m);
            System.out.println("List after adding head");
            l.print();
        }

    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class op {
    Node head;

    public void add(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void addhead(int data) {
        Node newh = new Node(data);
        if (head == null) {
            head = newh;

        } else {
            Node temp = head;
            head = newh;
            head.next = temp;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
