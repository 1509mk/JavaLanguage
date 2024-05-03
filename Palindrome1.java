import java.util.Scanner;

public class Palindrome1 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String rev = "";
    for(int i = s.length()-1;i>=0;i--){
      rev = rev + s.charAt(i);
    }
    if(s.equals(rev)){
      System.out.println("String is palindrome: ");
    }
    else{
      System.out.println("The string is not palindrome: ");
    }
    sc.close();
  }


}
