import java.util.*;  // print 1 and 0 pattern traingle concept...

public class Pattern6 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int n = myObj.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        int sum = i + j;
        if(sum %2==0){
          System.out.print("1" + " ");
        }else{
          System.out.print("0" + " ");
        }
      }System.out.println();
    }
    myObj.close();
  }
}