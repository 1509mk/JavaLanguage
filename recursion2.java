public class recursion2 {
  public static void main(String[] args){
    int result = sum(5, 9);
    System.out.println(result);
  }

  public static int sum(int x, int y){
    if(y > x){
      return y + sum(y,x-1);
    }else{
      return 0;
    }
  }
}
