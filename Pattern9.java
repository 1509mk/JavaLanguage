import java.util.*;  // pyramid traingle....

public class Pattern9 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int n = myObj.nextInt();

    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(i + " ");
      }
      System.out.println();
    }
    myObj.close();
  }
}
