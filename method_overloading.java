public class method_overloading {
  static int myParameter(int x, int y){
    return x + y;
  }

  static double myParameter(double x, double y){
    return x + y;
  }

  public static void main(String[] args){
    int myNum1 = myParameter(4, 7);
    int myNum2 = myParameter(5, 8);

    System.out.println("the first mesthod result is here: " + myNum1);
    System.out.println("The second method result is here: " + myNum2);
  }
}
