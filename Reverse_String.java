import java.util.Scanner;

public class Reverse_String {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder sb = new StringBuilder(str);
    System.out.println(sb.reverse().toString());
    sc.close();
  }
}
// StringBuilder is like a container for string where we don't want to add everytime a new string to the memory.
//String builder is mutable.