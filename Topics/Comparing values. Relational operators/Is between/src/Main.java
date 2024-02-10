import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // Read three integer numbers
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Check if the first number is between the second and third numbers (inclusive)
        boolean isBetween = (num1 >= num2 && num1 <= num3) || (num1 >= num3 && num1 <= num2);
        System.out.println(isBetween);
        scanner.close();
    }
}