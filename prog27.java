import java.util.*;

public class prog27 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            /*
             * int[] arr = new int[n];
             * for (int i = 0; i < arr.length; i++) {
             * arr[i] = s.nextInt();
             * }
             */
            ml l = new ml();
            System.out.println("Enter elements in linkedlist");
            for (int i = 0; i < n; i++) {
                l.add(s.nextInt());
            }
            l.print();
            System.out.println("Enter an element to delete");
            int m = s.nextInt();
            l.delete(m);
            System.out.println("After delete the element list is  ");
            l.print();
        }

    }

}

// Node class
class Node {
    // attributes
    int data;
    Node next;

    // perameterized constructer
    Node(int data) {
        this.data = data;
    }
}

// operator class
class ml {
    // declare head node
    Node head;

    // function to add data in linked list
    public void add(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            // when list is empty
            head = newnode;
        } else {
            // when list is not empty
            // create a node to prebvent head form iteration
            Node temp = head;
            // iterate temp until next node is not null
            while (temp.next != null) {
                temp = temp.next;
            }
            // put new node in null
            temp.next = newnode;
        }

    }

    public void print() {
        // in case list is empty
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        // declare a tempray node to iterate
        // because if we will iterate head it will lost
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void delete(int data) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.data == data) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }
}
