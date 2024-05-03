// Printing pattern 0's and 1's...

import java.util.Scanner;

public class Pattern15 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        if( (i+j) % 2 == 0){
          System.out.print(1 + " ");    //if there is sum of i and j is equal to zero then print "1"
        }else{
          System.out.print(0 + " "); // else print "0";
        }
      }
      System.out.println();
    }
    sc.close();
  }
}
