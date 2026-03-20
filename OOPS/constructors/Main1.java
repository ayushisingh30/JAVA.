class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Student obj = new Student("Ayushi", 20);  // constructor called with values
        obj.display();
    }
}