import java.util.Scanner;

public class Is_Prime {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    boolean isPrime = true;
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n % 2 == 0){
        isPrime = false;
        break;
      }
    }
    sc.close();
    if(isPrime){
      System.out.println(n + " is the prime number");
    }
    else{
      System.out.println(n + " is not a prime number");
    }
  }
}
