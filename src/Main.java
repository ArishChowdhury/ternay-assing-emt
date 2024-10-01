import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu to choose a program to run
        System.out.println("Choose an option:");
        System.out.println("1. Check Voting Eligibility");
        System.out.println("2. Find the Largest of Four Numbers");
        System.out.println("3. Check if a Number is Positive, Negative, or Neutral");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                checkVotingEligibility(scanner);
                break;
            case 2:
                findLargestOfFour(scanner);
                break;
            case 3:
                checkPositiveNegativeNeutral(scanner);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

        scanner.close();
    }

    public static void checkVotingEligibility(Scanner scanner) {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String result = (age >= 18) ? "You are eligible for voting." : "You are not eligible for voting.";
        System.out.println(result);
    }

    public static void findLargestOfFour(Scanner scanner) {
        System.out.print("Enter four numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int largest = (a > b)
                ? (a > c)
                ? (a > d ? a : d)
                : (c > d ? c : d)
                : (b > c)
                ? (b > d ? b : d)
                : (c > d ? c : d);

        System.out.println("The largest number is: " + largest);
    }


    public static void checkPositiveNegativeNeutral(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Neutral";
        System.out.println("The number is: " + result);
    }
}