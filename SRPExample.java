package wiprofirst.opencloseprinciple;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class StudentPrinter {
    void printDetails(Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("Marks: " + student.marks);
    }
}

public class SRPExample {
    public static void main(String[] args) {
        Student s = new Student("Amit", 85);
        StudentPrinter printer = new StudentPrinter();
        printer.printDetails(s);
    }
}
