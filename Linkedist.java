public class Linkedist {
  static class node {
    int data;// attributes(instance veriable)
    Node next;

    node(int data)// constructer
    {
      this.data = data;
      next = null;
    }

  }

  static class lll {
    public static Node head = null;

    public static void add(int data) {
      Node newnode = new Node(data);
      if (head == null) {
        head = newnode;
        return;
      }
      Node current = head;
      while (current != null) {
        current = current.next;
      }
      current = newnode;
    }
    // public static void remove(int data){
    // Node newnode=new Node(data);

    // }
    public static void print() {
      if (head == null) {
        System.out.println("list is empty");
      }
      Node current = head;
      while (current != null) {
        System.out.println(current);
        current = current.next;
      }
    }

  }

  public static void main(String args[]) {
    lll l = new lll();
    for (int i = 10; i >= 0; i++) {
      l.add(i);
    }
    l.print();
  }

}
