//Printing Palindrome pattern.... 

import java.util.Scanner;

public class Pattern16 {
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    // for handel outer loop print first..
    for(int i=1;i<=n;i++){
      // for inner loop to print spaces...
      for(int j=1;j<=2 * (n-i);j++){
        System.out.print(" ");
      }
      // for inner loop print first part...
      for(int j=i;j>=1;j--){
        System.out.print(j + " ");
      }
      // for inner loop print second part...
      for(int j=2;j<=i;j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
