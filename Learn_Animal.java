 // interface is used for multiple inheritance, beacuse in java multiple inheritance is not supported behalf on this interface is used for this!!/


interface Animal{
  public void animalSound();
  public void run();
}

class Pig implements Animal{
  public void animalSound(){
    System.out.println("Bhow Bhow...");
  }
  public void run(){
    System.out.println("Pig run wee weee weeee...");
  }
}


public class Learn_Animal {
  public static void main(String[] args) {
    Pig myPig = new Pig();
    myPig.animalSound();
    myPig.run();
  }  
}
