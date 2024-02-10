import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int butterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean isPartySuccessful = (!isWeekend && butterCups <= 20 && butterCups >= 10) || (
                isWeekend && butterCups >= 15 && butterCups <= 25
                );

        System.out.println(isPartySuccessful);
    }
}