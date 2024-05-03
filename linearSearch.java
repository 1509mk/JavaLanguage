import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Input search element
        System.out.print("Enter the element to search for: ");
        int x = sc.nextInt();

        // Perform linear search
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("Element found at index " + i);
                found = true;
                break; // Stop the loop once element is found
            }
        }
        
        // If element is not found
        if (!found) {
            System.out.println("Element not found in the array.");
        }

        sc.close();
    }
}
