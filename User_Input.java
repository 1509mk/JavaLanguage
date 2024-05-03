import java.util.Scanner;



public class User_Input {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in); // create an object!..
    System.out.println("Enter your UserName: ");

    String userName = myObj.nextLine();
    System.out.println("The username is: " + userName);

    myObj.close();
  }
}
