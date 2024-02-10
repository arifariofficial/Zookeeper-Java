import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // Reading numbers a, b, c from the input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Checking if any pair of numbers adds up to 20
        boolean result = (a + b == 20) || (a + c == 20) || (b + c == 20);

        // Outputting the result
        System.out.println(result);

        scanner.close();
    }
}