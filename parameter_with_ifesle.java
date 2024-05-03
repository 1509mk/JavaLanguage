public class parameter_with_ifesle {
  static void checkAge(int age){
    if(age >= 18){
      System.out.println("Hurray! I become an Adult");
    }
    else{
      System.out.println("Ouuch! There is one more year left to become adult");
    }
  }

  public static void main(String[] args) {
    checkAge(15);
  }
}
