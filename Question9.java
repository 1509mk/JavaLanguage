
import java.util.Scanner;

public class Question9 {

  public static int printFibonacci(int n){
    if(n <= 1){
      return n;
    }
    int fib1 = 0, fib2 =1, fib = 0;
    for(int i=2;i<=n;i++){
      fib = fib1 + fib2;
      fib1 = fib2;
      fib2 = fib;
    }
    return fib;
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of series you want to print: ");
    int n = sc.nextInt(); 

    for(int i=0;i<=n;i++){
      System.out.print(printFibonacci(i) + " ");
    }
    sc.close();
  }

}
