// Sum of first n natural numbers!!

public class Recursion3 {

  public static void sumOfNNaturalNumbers(int n , int i, int sum){
    if(i==n){ // base case
      sum += i;
      System.out.println(sum);
      return;
    }
    sum += i;
    sumOfNNaturalNumbers(n, i+1, sum);
  }
  public static void main(String[] args) {
    //int n = 1;
    sumOfNNaturalNumbers(5,1,0);
  }
}
