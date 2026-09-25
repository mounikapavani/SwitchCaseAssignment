import java.util.Scanner;

public class TicketSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- TICKET SYSTEM -----");
        System.out.println("1. General");
        System.out.println("2. Sleeper");
        System.out.println("3. AC");

        System.out.print("Enter ticket category: ");
        int choice = sc.nextInt();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        String category;
        double discount = 0;

        switch (choice) {

            case 1:
                category = "General";
                break;

            case 2:
                category = "Sleeper";
                break;

            case 3:
                category = "AC";
                break;

            default:
                System.out.println("Invalid category");
                sc.close();
                return;
        }

        double finalPrice;

        if (age < 5) {
            discount = 100;
            finalPrice = 0;
        } else if (age >= 5 && age <= 13) {
            discount = 50;
            finalPrice = price * 0.50;
        } else if (age >= 60) {
            discount = 60;
            finalPrice = price * 0.40;
        } else {
            finalPrice = price;
        }

        System.out.println("\n----- TICKET DETAILS -----");
        System.out.println("Category: " + category);
        System.out.println("Original Price: Rs." + price);
        System.out.println("Age: " + age);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: Rs." + finalPrice);

        sc.close();
    }
}