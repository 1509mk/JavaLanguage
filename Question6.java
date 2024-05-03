import java.util.*;
public class Question6 {

  public static void checkAge(int age){
    if(age >= 18){
      System.out.println("He is eligible to vote: ");
    }
    else{
      System.out.println("He is not eligible to vote: ");
    }
  }



  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age of person: ");
    int age = sc.nextInt();
    checkAge(age);
    sc.close();
  }
}
