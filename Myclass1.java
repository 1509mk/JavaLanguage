// Add two numbers by user input:


import java.util.Scanner;

public class Myclass1 {
  public static void main(String[] args) {
    int x,y,sum;
    Scanner myObj = new Scanner(System.in);
    System.out.println("Type first number: ");
    x = myObj.nextInt();
    System.out.println("Type the second number: ");
    y = myObj.nextInt();
    sum = x + y;
    myObj.close();

    System.out.println("Sum of two numbers is: " + sum);
  }
}
