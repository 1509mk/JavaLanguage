// holllow Traingle Pattern...

import java.util.Scanner;

public class Patteern17 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=i;j<n;j++){
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * i - 1); k++) {
        // printing stars.
        if (k == 1 || i == n || k == (2 * i - 1)) {
            System.out.print("*");
        }
        // printing spaces.
        else {
            System.out.print(" ");
        }
    } System.out.println();
      }
      sc.close();
    }
  }

