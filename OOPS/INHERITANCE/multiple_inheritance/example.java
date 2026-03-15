interface A {
    void run();
}

interface B {
    void run();
}

class C implements A, B {
    public void run() {
        System.out.println("C class run method");
    }
}

public class example {
    public static void main(String[] args) {
        C obj = new C();
        obj.run();
    }
}