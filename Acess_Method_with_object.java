public class Acess_Method_with_object {
  public void fullThrottle(){
    System.out.println("The car is going as fast as it can!");
  }
  public void speed(int maxSpeed){
    System.out.println("Max Speed is:  " + maxSpeed );
  }

  public static void main(String[] args){
    Acess_Method_with_object myObj = new Acess_Method_with_object();
    myObj.fullThrottle();
    myObj.speed(200);
  }
}
