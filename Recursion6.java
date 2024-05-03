public class Recursion6 {

  public static void towerOfHanoi(int n, String Src, String Help, String Dest){
    if(n==1){
      System.out.println("transfer disk " + " " + n + " from " + Src + " " + "to " + Dest );
      return;
    }
    towerOfHanoi(n-1, Src, Dest, Help);
    System.out.println("transfer disk " + " " + n + " from " + Src + " " + "to " + Dest );
    towerOfHanoi(n-1, Help, Src, Dest);

  }


  public static void main(String[] args) {
    int n = 3;
    towerOfHanoi(n,"S", "H", "D");
  }
}
