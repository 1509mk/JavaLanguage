// public class Main6 extends Thread{
//   public static void main(String[] args){
//     Main6 thread = new Main6();
//     thread.start();
//     System.out.println("The code is running outside the thread");
//   }
//   public void run(){
//     System.out.println("The code is running in a thread");
//   }
// }


public class Main6 extends Thread {
  public static int amount = 1;

  public static void main(String[] args) {
    Main6 thread = new Main6();
    thread.start();
    System.out.println(amount);
    amount++;
    System.out.println(amount);
  }

  public void run() {
    amount++;
  }
}