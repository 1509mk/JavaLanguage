import java.util.*;

public class Test1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();

    if(x == y){
      System.out.println("Both number are equal");
    }
    else if(x > y){
      System.out.println("X is greater than Y: ");
    }
    else if(x < y){
      System.out.println("X is Lesser than Y: ");
    }
    else{
      System.out.println("Number are not valid for this code!! ");
    }
    sc.close();
  }

}
