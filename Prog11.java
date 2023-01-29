
//oops implementation 
public class Prog11 {
    public static void main(String args[]) {
        Family fm1 = new Family("Rajendra", "Harbiri", 10);
        System.out.println(fm1.head);
        System.out.println(fm1.owner);
        System.out.println(fm1.familymember);
    }

}

class Family {
    public String head;
    public String owner;
    public int familymember;

    public void business() {
        System.out.print(this.head + " Business men");

    }

    public void Members() {
        System.out.print(this.familymember + " 7");
    }

    // Default constructers
    public Family() {
        this.head = "Father";
        this.owner = "Mom";

    }

    // Perameterized constructers
    public Family(String head, String owner, int familymember) {
        this.head = head;
        this.owner = owner;
        this.familymember = familymember;
    }

}
