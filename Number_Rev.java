// Factorial of number::

// import java.util.Scanner;
// public class Number_Rev {
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the number: ");
//     int n = sc.nextInt();
//     int fact = 1;
//     for(int i=1;i<=n;i++){
//       fact = fact*i;
//     }
//     System.out.println("Factorial of a number is: " + fact );
//     sc.close();
//   } 

// }




// reverse a number::


// import java.util.Scanner;

// public class Number_Rev{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int rev = 0;
//     while(n>0){
//       int digit = n % 10; // extract last digit
//       rev = rev * 10 + digit; // it reverse the number until it become 0
//       n = n / 10; // it gives remainder...
//     }
//     System.out.println(rev);
//     sc.close();
//   }
// }





//fibnoacci series::
// import java.util.Scanner;
// public class Number_Rev{
//   public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int a = 0;
//     int b = 1;
//     int nextTerm;
//     System.out.print(a + " " + b);
//     for(int i=2;i<n;i++){
//       nextTerm = a + b;
//       a = b;
//       b = nextTerm;
//       System.out.print(" " + nextTerm + " ");
//     }
//     sc.close();
//   }
// }






// GCD
// import java.util.Scanner;
// public class Number_Rev{
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n1 = sc.nextInt();
//     int n2 = sc.nextInt();
//     int n = 1;
//     if(n1 != n2){
//       while(n != 0){
//         n = n1 % n2;
//         if(n != 0){
//           n1 = n2;
//           n2 = n;
//         }
//       }
//       System.out.println(n2);
//     } else{
//       System.out.println("Wrong input: ");
//     }
//     sc.close();
//   }
// }







// check if two strings are anagram or not!!

// JAVA program to check whether two strings
// are anagrams of each other


//import java.io.*;
import java.util.Arrays;
//import java.util.Collections;

class GFG {

	/* function to check whether two strings are
	anagram of each other */
	static boolean areAnagram(char[] str1, char[] str2)
	{
		// Get lengths of both strings
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);

		// Compare sorted strings
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	/* Driver Code*/
	public static void main(String args[])
	{
		char str1[] = { 'g', 'r', 'a', 'm' };
		char str2[] = { 'a', 'r', 'm' };
	
		// Function Call
		if (areAnagram(str1, str2))
			System.out.println("The two strings are"
							+ " anagram of each other");
		else
			System.out.println("The two strings are not"
							+ " anagram of each other");
	}
}

