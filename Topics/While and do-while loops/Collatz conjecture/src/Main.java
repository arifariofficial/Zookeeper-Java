import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        while (n != 1) {
            System.out.println(n + " ");   // Print the current value of n

            // Apply the Collatz conjecture rules
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
        }
        System.out.print(n);
    }
}