public class Check_Palindrome {
  public static void main(String[] args){
    String str = "racecar";
    int i = 0;
    int j = str.length() - 1; 
    while(i < j){
      if(str.charAt(i) != str.charAt(j)){
        System.out.println(str + " " + " The string is not a palindrome.");
        return;
      }
      i++;
      j--;
      
    }
    System.out.println(str +" " + " The string is palindrome.");
  }
}
