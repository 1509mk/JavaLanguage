import java.util.*;  // Floyd's traingle concept...

public class Pattern5 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int n = myObj.nextInt();
    int number = 1;
    for(int i=1;i<=n;i++){ // 
      for(int j=1;j<=i;j++){
        System.out.print(number + " ");
        number++;
      }
      System.out.println();
    } 
    myObj.close();
  }
}