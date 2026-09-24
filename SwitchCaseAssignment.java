import java.util.Scanner;

public class SwitchCaseAssignment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Factorial of a Number");
        System.out.println("2. Neon Number");
        System.out.println("3. Sum of Digits");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                int n = 5;
                int factorial = 1;

                for (int i = 1; i <= n; i++) {
                    factorial = factorial * i;
                }

                System.out.println("Number: " + n);
                System.out.println("Factorial: " + factorial);
                break;

            case 2:
                int num = 9;
                int square = num * num;
                int sum = 0;

                while (square > 0) {
                    sum = sum + square % 10;
                    square = square / 10;
                }

                if (sum == num) {
                    System.out.println(num + " is a Neon Number");
                } else {
                    System.out.println(num + " is not a Neon Number");
                }
                break;

            case 3:
                int number = 12345;
                int digitSum = 0;

                while (number > 0) {
                    digitSum = digitSum + number % 10;
                    number = number / 10;
                }

                System.out.println("Sum of digits: " + digitSum);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}