class Outerclass{
  int x = 5;

class Innerclass {
  int y = 10;
}
}

public class Inner {
  public static void main(String[] args) {
    Outerclass myOuter = new Outerclass();
    Outerclass.Innerclass myInner = myOuter.new Innerclass();
    System.out.println(myInner.y + myOuter.x);
  } 
}

// Scanner myObj = new Scanner(System.in);  in java we take input like this from user...
