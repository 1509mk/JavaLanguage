//import java.util.Scanner;

import java.util.Scanner;

public class Find_Largest {
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
    int size = sc.nextInt();
    int[] n = new int[size];
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
        System.out.print("Enter element " + (i + 1) + ": ");
        n[i] = sc.nextInt();
    }
    sc.close();
    int max = n[0];
    for(int i=1;i<n.length;i++){
      if(n[i] > max){
        max = n[i];
      }
    }
    System.out.println("Largest Number is: " + max);
  }
}
