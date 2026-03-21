public class NestedLoopExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {        // outer loop (rows)
            for (int j = 1; j <= 4; j++) {    // inner loop (columns)
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}