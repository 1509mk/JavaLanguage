// Calculate the Sum of an Array......

public class Myclass4 {
  public static void main(String[] args){
    int [] arr = {4,6,8,9};
    int sum = 0;
    for(int i=0;i<arr.length;i++){
      sum += arr[i];
    }
    System.out.println("Sum of the array elements is: " + sum);

  }
}
