// class Student{
//   String name;
//   String surname;
//   int roll_no;
//   Student(String studentName, String studentSurname, int studentRoll_no){
//     this.name = studentName;
//     this.surname = studentSurname;
//     this.roll_no = studentRoll_no;
//   }
//   public void getStudentDetails(){
//     System.out.println("The student name is " + this.name + " " + this.surname);
//     System.out.println("The student roll no is " + this.roll_no);
//   }
// }

import java.util.Scanner;

public class OOPS {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); 
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
    sc.close();
}
}
