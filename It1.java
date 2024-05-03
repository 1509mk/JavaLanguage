import java.util.ArrayList;
import java.util.Iterator;

public class It1 {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Mazda");
    cars.add("Ford");

    // get iterator...

    Iterator<String> it = cars.iterator();
    while(it.hasNext()) {
      System.out.println(it.next());
    }
    
    
  }
}
