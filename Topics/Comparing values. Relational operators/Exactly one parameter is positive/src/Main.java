import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // Read three integer numbers
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Count how many of these numbers are positive
        int positiveCount = 0;
        if (num1 > 0) positiveCount++;
        if (num2 > 0) positiveCount++;
        if (num3 > 0) positiveCount++;

        // Check if exactly one of the numbers is positive
        boolean exactlyOnePositive = positiveCount == 1;

        // Print the result
        System.out.println(exactlyOnePositive);

        scanner.close();
    }
}