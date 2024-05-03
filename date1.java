import java.time.LocalDate;


public class date1 {
  public static void main(String[] args) {
    LocalDate myObj = LocalDate.now();
    LocalDate tomorrowDate = myObj.minusDays(1);
    System.out.println(myObj);
    System.out.println(tomorrowDate);
  }
}
