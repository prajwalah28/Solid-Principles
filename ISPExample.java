package wiprofirst.opencloseprinciple;


interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class SimplePrinter implements Printer {
    public void print() {
        System.out.println("Printing document");
    }
}

class AllInOnePrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class ISPExample {
    public static void main(String[] args) {
        Printer p1 = new SimplePrinter();
        Printer p2 = new AllInOnePrinter();
        Scanner s1 = new AllInOnePrinter();

        p1.print();
        p2.print();
        s1.scan();
    }
}
