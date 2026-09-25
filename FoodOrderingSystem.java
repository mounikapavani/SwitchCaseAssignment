import java.util.Scanner;

public class FoodOrderingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- FOOD ORDERING SYSTEM -----");
        System.out.println("1. Pizza - Rs.200");
        System.out.println("2. Burger - Rs.250");
        System.out.println("3. Biryani - Rs.200");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int price = 0;
        String item = "";

        switch (choice) {
            case 1:
                item = "Pizza";
                price = 200;
                break;

            case 2:
                item = "Burger";
                price = 250;
                break;

            case 3:
                item = "Biryani";
                price = 200;
                break;

            default:
                System.out.println("Invalid choice");
                sc.close();
                return;
        }

        double total = price * quantity;
        double discount = 0;

        if (quantity > 5) {
            discount = total * 0.05;
        }

        double finalAmount = total - discount;

        System.out.println("\n----- BILL -----");
        System.out.println("Item: " + item);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: Rs." + total);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Amount: Rs." + finalAmount);

        sc.close();
    }
}