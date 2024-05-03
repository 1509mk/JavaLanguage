import java.util.Scanner;

public class Packages {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter ur username");

    String userName = scanner.nextLine();
    System.out.println("Username is: " + userName);

    scanner.close();
  }  
}
