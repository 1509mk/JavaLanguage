// Calculating the factorial of a number!!

public class Recursion4 {

  public static int calculateFactorial(int n ){
    
    if(n == 1 || n == 0){
      return 1;
    }

    int fact_nm1 = calculateFactorial(n-1);
    int fact_n = n * fact_nm1;
    return fact_n;

  }
  public static void main(String[] args) {
    int n = 6;
    int ans = calculateFactorial(n);
    System.out.println("The factorial of a number is: " + ans);
  }
}
