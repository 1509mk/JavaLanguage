public class Encapsulation {
  private String name;

  // getter function
  public String getName(){
    return name;
  } 

  // setter function
  public void setName(String newName){
    this.name = newName;
  }

  public static void main(String[] args){
    Encapsulation myObj = new Encapsulation();
    myObj.name = "Mayank";
    System.out.println(myObj.name);
  }
}


