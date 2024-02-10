import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int sum = 0;
        while (true){
            int number = scanner.nextInt();
            if (number == 0){   // Exit the loop
                break;
            }
            sum += number;
        }
        System.out.println(sum);
    }
}