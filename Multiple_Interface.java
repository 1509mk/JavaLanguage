interface First_Interface{
  public void myMethod();
}                                         // Multiple interface supported by java...

interface Second_Interface{
  public void mySecondMethod();
}


class DemoClass implements First_Interface, Second_Interface{
  public void myMethod(){
    System.out.println("The first text in this interface: ");
  }

  public void mySecondMethod(){
    System.out.println("The second text in the interface: ");
  }
}




public class Multiple_Interface {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.mySecondMethod();
  }
}
