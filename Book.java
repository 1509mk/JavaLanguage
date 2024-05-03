// import java.io.File;

// public class Book {
//   public static void main(String[] args) {
//     File myObj = new File("C:\\Users\\MAYANK KANSAL\\OneDrive\\Desktop");
//     System.out.println(myObj);
//   }
// }

import java.io.File;
import java.io.IOException;  // to handel the errors...

public class Book{
  public static void main(String[] args) {
    try{
      File myObj = new File("C:\\Users\\MAYANK KANSAL\\OneDrive\\Desktop");
      if(myObj.createNewFile()){
        System.out.println("File Created " + myObj.getName());
      }
      else{
        System.out.println("File already exist");
      }
    } catch(IOException e){
      System.out.println("An error occured. ");
      e.printStackTrace();
    }
  }
}



