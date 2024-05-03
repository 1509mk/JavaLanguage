// Reverse the string by this logic....


// public class Myclass3 {
//   public static void main(String[] args) {
//     String originalString= "Hello";
//     String revString = "";
//     for(int i=0;i<originalString.length();i++){
//       revString = originalString.charAt(i) + revString;
//     }

//     System.out.println("Reversed String: " + revString);
//   }
// }
 





// When u take input from user use this logic to reverse the string...

import java.util.Scanner;

public class Myclass3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String reversed = reverseString(str);

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverseString(String str) {
        // Create a StringBuilder object and append the input string
        StringBuilder sb = new StringBuilder(str);
        // Use the reverse() method of StringBuilder to reverse the string
        sb.reverse();
        // Convert StringBuilder back to a String and return it
        return sb.toString();
    }
}
