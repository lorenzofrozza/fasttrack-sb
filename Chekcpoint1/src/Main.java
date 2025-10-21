import java.util.Scanner;

public class Main {
    static Scanner keyboard = new Scanner(System.in);
    static int a, b;

    public static void main(String[] args) {
        int option;
        int totalOperations = 0;

        do {
            System.out.println("\n-- MENU --");
            System.out.println("1 - SUM (+)");
            System.out.println("2 - SUBTRACTION (-)");
            System.out.println("3 - MULTIPLICATION (x)");
            System.out.println("4 - DIVISION (/)");
            System.out.println("5 - TOTAL OF OPERATIONS (=)");
            System.out.println("0 - EXIT");
            System.out.print("\nChoose the option: ");
            option = keyboard.nextInt();

            switch (option) {
                case 1:
                    askNumbers();
                    System.out.println("Result: " + sum(a, b));
                    totalOperations+=1;
                    break;

                case 2:
                    askNumbers();
                    System.out.println("Result: " + subtraction(a, b));
                    totalOperations+=1;
                    break;

                case 3:
                    askNumbers();
                    System.out.println("Result: " + multiplication(a, b));
                    totalOperations+=1;
                    break;

                case 4:
                    askNumbers();
                    if (b != 0) {
                        System.out.println("Result: " + division(a, b));
                        totalOperations+=1;
                    } else {
                        System.out.println("Cannot divide by zero!");
                    }
                    break;
                case 5:
                    System.out.println("Total of operations: "+totalOperations);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option, please try again!");
                    break;
            }

        } while (option != 0);

        keyboard.close();
    }

    static void askNumbers() {
        System.out.print("Enter first number: ");
        a = keyboard.nextInt();

        System.out.print("Enter second number: ");
        b = keyboard.nextInt();
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int subtraction(int a, int b) {
        return a - b;
    }

    static int multiplication(int a, int b) {
        return a * b;
    }

    static double division(int a, int b) {
        return (double) a / b;
    }
}