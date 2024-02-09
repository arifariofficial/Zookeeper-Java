import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();          // Read size(n) from  input
        int[] arr = new int[n];        // Declare array size

        for (int i = 0; i < n; i++) {  // Filling array with user input
            arr[i] = in.nextInt();
        }

        // Use a LinkedHashSet to preserve insertion order and remove duplicates
        LinkedHashSet<Integer> elements = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {            // Filling "elements" with "arr"
            elements.add(arr[i]);
        }
        Iterator<Integer> iterator = elements.iterator();  // Iterator for LinkedHashSet
        boolean hasUnique = false;                         //flag to track unique element

        // Iterate over the LinkedHashSet using the iterator
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            int count = 0;                          // Counter for duplicates in "arr"
            for (int item : arr) {
                if (element.equals(item)) {
                    count++;
                }
            }
            if (count == 1) {                // if counter == 1, it's unique
                System.out.println(element);
                hasUnique = true;
            }
        }
        if (!hasUnique) {
            System.out.println("No unique integers");
        }
        // Close the Scanner object
        in.close();
    }
}