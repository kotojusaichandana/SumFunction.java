import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Call the function to calculate the sum
        int result = addNumbers(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);

        scanner.close();
    }

    // Function to calculate the sum of two numbers
    public static int addNumbers(int a, int b) { // Correct return type
        return a + b;
    }
}
