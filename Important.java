// public class Important{
//   public static void main(String[] args) {
//     int n = 5;
//     int i,fact=1;
//     for(i=1;i<=n;i++){
//       fact=fact*i;
//     }
//     System.out.println("The factorial of number is: " + fact);
//   }
// }


// public class Important{
//   public static void main(String[] args) {
//     int n = 123;
//     int rev = 0;
//     while(n != 0){
//       int rem = n % 10;
//       rev = rev*10 + rem;
//       n = n/10;
//     }
//     System.out.println("The reverse number is " + rev);
//   }
// }

public class Important{
  public static void main(String[] args) {
    int n1=0;
    int n2 = 1;
    int n3;
    int count = 7;
    System.out.print(n1 + " " + n2);
    for(int i=2;i<=count;i++){
      n3 = n1 + n2;
      System.out.print(" " +n3);
      n1 = n2;
      n2 = n3;
    }
  }
}