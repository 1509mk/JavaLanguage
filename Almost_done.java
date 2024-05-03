import java.util.ArrayList;

public class Almost_done {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("Mercedes");
    cars.add("Adui");
    cars.add("Alto");
    cars.add("Lexus");
    cars.set(0, "BMW");
    System.out.println(cars.get(0));
  }
}
