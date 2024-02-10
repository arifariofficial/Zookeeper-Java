import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int largestElement = Integer.MIN_VALUE; // Initialize
        while (true){
            int element = scanner.nextInt();
            if (element == 0) {
                break;
            }
            if (largestElement < element){
                largestElement = element;
            }
        }
        System.out.println(largestElement);
    }
}