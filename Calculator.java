import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number:");
        double secondNumber = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /):");
        String operation = scanner.next();

        switch (operation) {
            case "+":
                System.out.println("Result: " + add(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println("Result:" + subtract(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println("Result:" + multiply(firstNumber, secondNumber));
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    System.out.println("Result:" + divide(firstNumber, secondNumber));
                }
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }

        scanner.close();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
