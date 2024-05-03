
// In java count the words...

public class Myclass2 {
  public static void main(String[] args) {
    String words = "One Two Three Fours Five";
    int countWords = words.split("\\s").length;
    System.out.println(countWords);
  }
}
