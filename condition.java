public class condition {
  public static void main(String[] args){
    int time = 10;
    if(time < 10){
      System.out.println("Good Morning!!");
    }
    else if(time < 18){
      System.out.println("Good AfterNoon!!");
    }
    else{
      System.out.println("Good Evening!!");
    }

    // int i=0;
    // while(i < 5){
    //   System.out.println(i);
    //   i++;
    // }

  //   String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    
  //   for (String i : cars) {
  //     System.out.println(i);
  //  }

  //  for(int i=0;i <= 10; i++){
  //   if(i == 4){
  //     continue;
  //   }
  //   System.out.println(i);
  //  }

   int i=0;
   while(i < 10){
    if(i==4){
      i++;
      continue;
    }
    System.out.println(i);
    i++;
   }

  }
}
