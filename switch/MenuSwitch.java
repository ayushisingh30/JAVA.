import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Juice");
        System.out.println("Choose option:");

        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("You selected Coffee");
                break;

            case 2:
                System.out.println("You selected Tea");
                break;

            case 3:
                System.out.println("You selected Juice");
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}