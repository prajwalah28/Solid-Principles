package wiprofirst.opencloseprinciple;

class Bird {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }
}

class Crow extends Bird {
    @Override
    void fly() {
        System.out.println("Crow is flying");
    }
}

public class LSPExample {
    public static void main(String[] args) {
        Bird b1 = new Sparrow();
        Bird b2 = new Crow();

        b1.fly();
        b2.fly();
    }
}
