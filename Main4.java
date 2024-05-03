import java.util.HashMap;


public class Main4 {
  public static void main(String[] args) {
    HashMap<String, String> myHashMap = new HashMap<String, String>();

   // add key values and pairs(Country and city);

    myHashMap.put("England", "London");
    myHashMap.put("India", "Delhi");
    myHashMap.put("Germay", "Berlin");
    myHashMap.put("Norway", "Oslo");
    myHashMap.put("Usa", "Chicago");

    System.out.println(myHashMap);
  }
}
