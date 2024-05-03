import java.util.*;

public class Pattern1 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int n = myObj.nextInt();
    //int m = myObj.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        System.out.print("*");
      }
      System.out.println();
    }
    myObj.close();
  }
}

