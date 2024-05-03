public class Question2 {
  public static void main(String[] args) {
    int sum = 0;
    int n = 10;
    for(int i=1; i<=n; i++){
      if(i % 2 != 0){
        sum = sum + i;
        System.out.println(sum);
      }
  }
  System.out.println("The sum of all odd numbers up to " + n + " is: " + sum);
}
}

