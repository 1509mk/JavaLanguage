public class Recursion8 {

  public static int first = -1;
  public static int last = -1;

  public static void findOccurence(String str, int indx, char element){

    if(indx == str.length()){
      System.out.println(first);
      System.out.println(last);
      return;
    }
    char currChar = str.charAt(indx);
    if(currChar == element){
      if(first == -1){
        first = indx;
      }
      else{
        last = indx;
      }
    }
    findOccurence(str, indx+1, element);
  }


  public static void main(String[] args){
    String str = "abaacdaefaaah";  
    findOccurence(str, 0, 'a');
  }
}
