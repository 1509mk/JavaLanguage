// import java.util.HashSet;

// public class Main5 {
//   public static void main(String[] args) {
//     HashSet<String> cars = new HashSet<String>();
//     cars.add("Volvo");
//     cars.add("BMW");
//     cars.add("Mazda");
//     cars.add("Ford");
//     cars.add("BMW");
//     System.out.println(cars);
//   }
// }


import java.util.HashSet;

public class Main5{
  public static void main(String[] args){
    HashSet<Integer> numbers = new HashSet<Integer>();
    numbers.add(4);
    numbers.add(6);
    numbers.add(8);

    for(int i=1;i<10;i++){
      if(numbers.contains(i)){
        System.out.println(i + " " + "Number found in the set!!");
      }
      else{
        System.out.println(i + " " + "Number not found in the set!!");
      }
    }
  }
}