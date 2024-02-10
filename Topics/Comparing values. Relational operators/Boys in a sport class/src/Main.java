import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        // Read three integer numbers representing the heights
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();

        // Check if the boys are arranged in ascending or descending order by height
        boolean isCorrectlyArranged = (h1 <= h2 && h2 <= h3) || (h1 >= h2 && h2 >= h3);

        // Print the result
        System.out.println(isCorrectlyArranged);

        scanner.close();
    }

}