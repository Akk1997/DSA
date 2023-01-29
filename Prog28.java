import java.util.Scanner;

public class Prog28 {
    // delete middle of linked list
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            // enter size of array
            System.out.println("Enter size of arrey ");
            int n = s.nextInt();

            int[] arr = new int[n];
            // enter the valuse
            System.out.println("Enter values of array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            // create object for class
            op l = new op();
            // add values in list
            for (int i = 0; i < arr.length; i++) {
                l.add(arr[i]);
            }
            System.out.println("Print initial list ");
            l.print();
            System.out.println("Print list after deleteing middle");
            l.delete();
            l.print();
        }

    }

}

// node class
class Node {
    // declare attributes
    // data type : veriable name
    int data;
    Node next;

    // declare constructor
    Node(int data) {
        this.data = data;
    }
}

// operator class
class op {
    // declare head node
    Node head;

    public void add(int data) {
        // create a new node
        Node newNode = new Node(data);
        // in case linkedlist is empty
        if (head == null) {
            head = newNode;
        } else {
            // declare a temprary node
            Node temp = head;
            // iterate till end
            while (temp.next != null) {
                temp = temp.next;
            }
            // put new node in place of null
            temp.next = newNode;
        }
    }

    public void print() {
        // in case linkedlist is empty
        if (head == null) {
            System.out.print("List is empty");
        } else {
            // create a temprary node
            Node temp = head;
            // iterate till temp dose not become null
            while (temp != null) {
                // print every value
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void delete() {
        // while list is empty
        if (head == null) {
            return;
        } else {
            // declare two veriables
            // fast & Slow
            Node fast = head.next;
            Node slow = head;
            while (fast != null && fast.next != null) {
                if (fast != head.next) {
                    slow = slow.next;
                }
                // fast run doule
                fast = fast.next.next;

            }
            slow.next = slow.next.next;
        }
    }

}
