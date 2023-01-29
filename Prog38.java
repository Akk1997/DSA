public class Prog38 {
    public static void main(String[] args) {

        LinkListStackDemo linkListStackDemo = new LinkListStackDemo();

        linkListStackDemo.push(2);

        linkListStackDemo.push(3);

        linkListStackDemo.push(4);

        linkListStackDemo.push(5);

        linkListStackDemo.push(7);

        while (LinkListStackDemo.head != null) {

            System.out.println(linkListStackDemo.peek());

            linkListStackDemo.pop();

        }

    }

    static class Node {

        int data;

        Node next;

        Node(int data) {

            this.data = data;

            next = null;

        }

    }

    static class LinkListStackDemo {

        public static Node head = null;

        public void push(int data) {

            Node newNode = new Node(data);

            if (head == null) {

                head = newNode;

            } else {
                newNode.next = head;

                head = newNode;
            }

        }

        public int pop() {

            if (head == null)
                return -1;

            // Node newnode = head;
            head = head.next;
            return head.data;
        }

        public int peek() {

            if (head == null)
                return -1;

            return head.data;

        }

    }
}