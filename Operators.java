public class Operators {
  public static void main(String[] args){
    int x = 50;
    int y = 60;

    System.out.println(x < y);

    int sum;
    sum = x + y;
    int Sub;
    Sub = x - y;
    int Mul;
    Mul = x * y;
    int Division;
    Division = x / y;
    int Modulous;
    Modulous = x % y;

    System.out.println(sum);
    System.out.println(Sub);
    System.out.println(Mul);
    System.out.println(Division);
    System.out.println(Modulous);

    String greeting = "Good Morning";
    System.out.println("the length of the string: " + greeting.length());
    System.out.println(greeting.toUpperCase());
    System.out.println(greeting.toLowerCase());

    System.out.println(greeting.indexOf("Morning"));

    System.out.println(Math.max(6,9));
    System.out.println(Math.min(6,9));
    System.out.println(Math.abs(-4.5));

    int randomNum = (int)(Math.random() * 101);
    System.out.println(randomNum);

  }
}
