// public class BasicPattern {
//   public static void main(String[] args) {
//     int n = 5;
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int j=1;j<=i;j++){
//         System.out.print("*" + " ");
//       }
//       System.out.println();
//     }

//     for(int i=n;i>=1;i--){
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int j=1;j<=i;j++){
//         System.out.print("*" + " ");
//       }
//       System.out.println();
//   }
// }
// }

// public class BasicPattern{
//   public static void main(String[] args) {
//     int n = 4357;
//     int rev = 0;

//     while(n != 0){
//       int rem = n % 10;
//       rev  = rev * 10 + rem;
//       n = n/10;
//     }
//     System.out.println("The reverse number is: " + rev);
//   }
// }

// public class BasicPattern{
//   public static void main(String[] args) {
//     String str = "Geeks";
//     String nstr = "";
//     char ch;

//     // traverse the whole string from for loop!

//     for(int i=0;i<str.length();i++){
//       ch = str.charAt(i);
//       nstr = ch + nstr;  /// place krdega existing string....
//     }
//     System.out.println("The reverse the string is: " + nstr);

//   }
// }


public class BasicPattern{
  public static void main(String[] args) {
    int n1 = 0, n2= 1, n3, count=10;
    System.out.print(n1 + " " + n2);

    for(int i=2;i<count;i++){
      n3 = n1 + n2;
      System.out.print(n3 + " ");
      n1 = n2;
      n2 = n3;
    }
  }
}