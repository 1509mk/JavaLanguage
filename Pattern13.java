// Printing traingle pattern...

import java.util.Scanner;
public class Pattern13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){  // for space print ....
        System.out.print(" ");
      }
      for(int k=1;k<=i;k++){   /// for pattern print...
        System.out.print(k + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
