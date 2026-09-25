import java.util.Scanner;

public class GradingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        System.out.println("1. Theoretical");
        System.out.println("2. Practical");

        System.out.print("Enter subject type: ");
        int choice = sc.nextInt();

        String grade;

        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        switch (choice) {
            case 1:
                System.out.println("Subject Type: Theoretical");
                break;

            case 2:
                System.out.println("Subject Type: Practical");
                break;

            default:
                System.out.println("Invalid subject type");
                sc.close();
                return;
        }

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
