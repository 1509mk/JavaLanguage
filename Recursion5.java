public class Recursion5 {

  public static void printFib(int a, int b, int n){

    if(n == 0){ //base case....
      return;
    }

    int c = a + b;
    System.out.print(c + " ");
    printFib(b, c, n-1);
  }


  public static void main(String[] args) {
    int a = 0;
    int b = 1;
    System.out.print(a + " ");
    System.out.print(b + " ");
    int n = 8;
    printFib(a, b, n-2);
  }
}
