import java.util.*;

public class question4 {

  public static int circleCircumfrence(int r){
    double pi = 3.14;
    int circumference = (int) (2 *pi * r);
    return circumference;
  }




  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    int r = sc.nextInt();
    int circumference = circleCircumfrence(r);
    System.out.println("Circumfrence of the circle is: " + circumference);
    sc.close();

  }
}
