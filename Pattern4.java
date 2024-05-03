import java.util.*;

public class Pattern4 {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    int n = myObj.nextInt();
    for(int i=n;i>=1;i--){ // 
      for(int j=1;j<=i;j++){
        System.out.print(j+ " ");
      }
      System.out.println();
    } 
    myObj.close();
  }
}


/*for reverse the pyramid logic you use:  (n-i-1)
 or you can use else....change the first loop
in which i gotes n to 1 and --i;*/