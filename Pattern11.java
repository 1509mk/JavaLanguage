import java.util.*;  // Diamond pattern concept....

public class Pattern11 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int n = myObj.nextInt();

    // first half...
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=i;j>=1;j--){
        System.out.print("*");
      }

      for(int j=2;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }


    // second half
    for(int i=n;i>=1;i--){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
      }
      for(int j=i;j>=1;j--){
        System.out.print("*");
      }

      for(int j=2;j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    myObj.close();
  }
}
