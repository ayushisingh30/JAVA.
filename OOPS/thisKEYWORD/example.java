
public class example {
    int x;

    public example (int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        example myObj = new example(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
