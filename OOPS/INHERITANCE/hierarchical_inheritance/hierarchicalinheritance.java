class A {
    public void printA() {
        System.out.println("Class A method");
    }
}

class B extends A {
    public void printB() {
        System.out.println("Class B method");
    }
}

class C extends A {
    public void printC() {
        System.out.println("Class C method");
    }
}

public class hierarchicalinheritance {
    public static void main(String[] args) {

        B obj = new B();
        obj.printA();
        obj.printB();

        C obj1 = new C();
        obj1.printA();
        obj1.printC();
    }
}