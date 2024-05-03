public class error {
  public static void main(String[] args){
    try{
      int[] myNumber = {1, 2, 3,4};
      System.out.println(myNumber[10]);
    }
    catch(Exception e){
      System.out.println("Something went wrong!!");
    }  
    finally{
      System.out.println("Finally try and catch is finished!!");
    }
  }
}
