import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // Read a value from user input
        int value = scanner.nextInt();

        // Check if the value is less than 10 and print the result
        boolean isLessThanTen = value < 10;
        System.out.println(isLessThanTen);

        scanner.close();
    }
}