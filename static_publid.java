public class static_publid {
  static void myStaticMethod(){
    System.out.println("Static methods can be called without creating objects");
  }
  public void myPublicMethod(){
    System.out.println("Public methods cannot be called without creating objects");
  }

  public static void main(String[] args){
    myStaticMethod();
    static_publid myObj = new static_publid();
    myObj.myPublicMethod();
  }
}
