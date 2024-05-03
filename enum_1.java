public class enum_1 {
  enum level {
    LOW,
    HIGH,
    MEDIUM
  }

  public static void main(String[] args) {
    for(level myVar : level.values()){
      System.out.println(myVar);
    }
  }
}

//   public static void main(String[] args){
//     level myVar = level.MEDIUM;
//     System.out.println(myVar);
//   }


// enum is like a class and interface which is used for storing constants variables like : final varaible..