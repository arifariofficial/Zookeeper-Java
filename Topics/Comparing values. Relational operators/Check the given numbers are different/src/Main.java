import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        // Read three numbers
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Check if all numbers are different
        boolean allDifferent = num1 != num2 && num1 != num3 && num2 != num3;

        // Print the result
        System.out.println(allDifferent);

        scanner.close();
    }
}