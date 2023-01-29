
public class Prog26 {
    public static void main(String args[]) {
        myList l1 = new myList();
        l1.addl(5);
        l1.addl(8);
        l1.addl(10);
        l1.print();

    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

}

class mylist {
    Node head;

    public void add(int data) {
        Node n1 = new Node(data);
        if (head == null) {
            head = n1;
        } else {
            head.next = n1;
        }

    }

    public void print() {
        if (head == null) {
            System.out.println("list is empty");
        }
        Node temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
