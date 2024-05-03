import java.util.Scanner;

public class Strings2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      String s1 = "Mayank";
      String s2 = "Mayank2";

      if(s1.compareTo(s2) == 0){
        System.out.println("The strings are equal: ");
      }else{
        System.out.println("Strings are not equal: ");
      }
      sc.close();
    }
    
  }

