import java.util.Scanner;

public class FoodMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");

        System.out.print("Choose an option: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("You ordered Pizza");
                break;

            case 2:
                System.out.println("You ordered Burger");
                break;

            case 3:
                System.out.println("You ordered Pasta");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
