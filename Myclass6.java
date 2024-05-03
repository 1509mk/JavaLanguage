// import java.util.Scanner;


// public class Myclass6 {
//   public static void main(String[] args){

//     Scanner myObj = new Scanner(System.in);
//     System.out.println("Enter the number: ");
//     int number = myObj.nextInt();

//     // check even or odd:

//     if(number % 2 == 0){
//       System.out.println(number + " the number is even: ");
//     }
//     else{
//       System.out.println(number + " is odd.");
//     }

//     myObj.close();
//   }
// }



public class Myclass6{
  public static void main(String[] args){

    int x = 9;
    int y = 10;
    int maximum = max(x,y);
    System.out.println("the maximum number is:" + maximum);
  }
  public static int max(int x, int y){
    return x > y ? x : y;
  }
}
