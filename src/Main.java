import java.util.Scanner;

public class Main {

    public static void calculator(Scanner sc) {
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/': System.out.println("Result: " + (a / b)); break;
            default: System.out.println("Invalid operator");
        }
    }

    public static void percentage(Scanner sc) {
        System.out.print("Enter total marks: ");
        double total = sc.nextDouble();

        System.out.print("Enter obtained marks: ");
        double obtained = sc.nextDouble();

        double percent = (obtained / total) * 100;
        System.out.println("Percentage: " + percent + "%");
    }

    public static void grade(Scanner sc) {
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) System.out.println("Grade: A");
        else if (marks >= 75) System.out.println("Grade: B");
        else if (marks >= 50) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");
    }

    public static void converter(Scanner sc) {
        System.out.print("Enter kilometers: ");
        double km = sc.nextDouble();

        double miles = km * 0.621371;
        System.out.println("Miles: " + miles);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Toolkit ---");
            System.out.println("1. Calculator");
            System.out.println("2. Percentage Calculator");
            System.out.println("3. Grade Calculator");
            System.out.println("4. Unit Converter");
            System.out.println("5. Exit");

            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: calculator(sc); break;
                case 2: percentage(sc); break;
                case 3: grade(sc); break;
                case 4: converter(sc); break;
                case 5: System.out.println("Goodbye!"); return;
                default: System.out.println("Invalid choice");
            }
        }
    }
}
