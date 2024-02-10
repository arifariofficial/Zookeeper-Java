import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberOfElements = scanner.nextInt();
        int counter = 0;
        int maxElementDivisibleBy4 = Integer.MIN_VALUE; // Initialize with the smallest possible value

        while (counter < numberOfElements) {
            int element = scanner.nextInt();

            if (element % 4 == 0 && element > maxElementDivisibleBy4) {
                maxElementDivisibleBy4 = element;
            }
            counter++;
        }
        scanner.close();
        System.out.println(maxElementDivisibleBy4);
    }
}