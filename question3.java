import java.util.*;

public class question3 {

  public static int findLargest(int a, int b){
    if(a > b){
      return a;
    }
    else{
      return b;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    int a = sc.nextInt();
    System.out.println("Enter the second number: ");
    int b = sc.nextInt();

    int findLargest =  findLargest(a, b);
    System.out.println("The largest number is: "+ findLargest);

    sc.close();
  }
  
}
