import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // Read an integer value from the user input
        int value = scanner.nextInt();

        // Check if the value is less than 10 and greater than 0
        boolean isValid = value < 10 && value > 0;

        // Print the result
        System.out.println(isValid);

        scanner.close();
    }
}