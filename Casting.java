public class Casting {
  public static void main(String[] args){
    // Widening casting ..!!
    int myNum = 33;
    double myDouble = myNum;

    System.out.println(myNum);  // converting smaller size to larger size...
    System.out.println(myDouble);

    // Narrowing Casting..!!
    double twice = 33;
    int myInt = (int) twice;

    System.out.println(twice);  // converting larger size to smaller size...
    System.out.println(myInt);

  }
}
