import java.util.Scanner;

public class Find_Second_Largest {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = sc.nextInt();
    int[] nums = new int[size];
    System.out.println("Enter the elements of the array: ");
    for(int i=0;i<size;i++){
      System.out.print("Enter the element at index " + i + " of the array: ");
      nums[i] = sc.nextInt();
    }
    sc.close();
    // int[] nums = {1,3,9,8,5,6};
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
      if(nums[i] > max){
        secondMax = max;
        max = nums[i];
      } else if(nums[i] > secondMax && nums[i] != max){
        secondMax = nums[i];
      }
    }
    System.out.println("the second largest number is: " + secondMax);

  }
}
