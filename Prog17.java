class Prog17 {
    public static void main(String args[]) {
        Student student = new Student("Subham", 1);
        student.printName();

        Person person = new Person("Subham2");
        System.out.println(person.name);
    }
}

class Person {
    protected String name;

    protected Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    public int rollNumber;

    protected Student(String name, int rollNumber) {
        super(name);
        this.rollNumber = rollNumber;
    }

    public void printName() {
        System.out.println(this.name);
    }
}