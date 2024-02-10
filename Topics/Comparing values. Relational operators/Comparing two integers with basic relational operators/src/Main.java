import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read the first integer
        int a = scanner.nextInt();

        // read the second integer
        int b = scanner.nextInt();

        // Comparing 'a' and 'b' using basic relational operators
        if (a > b) {
            System.out.println("Greater");
        } else if (a < b) {
            System.out.println("Less");
        } else {
            // This condition implicitly covers the case where a == b
            System.out.println("Equal");
        }

        scanner.close();
    }
}