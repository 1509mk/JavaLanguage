public class swap1 {
  public static void main(String[] args){
    int x = 4;
    int y = 5;
    // swap this two numbers without using third varaible//

    x = x + y; // 9
    y = x - y; //4
    x = x - y; //5

    System.out.println("Swap of two numbers is " + x + " " + y);
  }
}
