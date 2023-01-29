import java.util.Scanner;
//import java.util.LinkedList;

public class Prog14 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            myList ml = new myList();
            ml.print();
            System.out.println("Please enter numbers to add");
            for (int i = 0; i < 10; i++) {
                ml.addl(s.nextInt());
            }
            ml.print();

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

class myList {
    Node head;

    public void addl(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;

            }
            temp.next = newNode;
        }

    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;

        System.out.println("Printing the list ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /*
     * public void delete() {
     * if (head == null) {
     * System.out.println("List is empty");
     * } else {
     * Node temp = head;
     * while (temp.next != null) {
     * if (temp.next.data == n) {
     * 
     * }
     * }
     * temp = null;
     * }
     * }
     */

}
