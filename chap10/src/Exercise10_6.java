import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise10_6 {
    public static void main(String[] args) {
        LocalDate birthDay = LocalDate.of(1998, 4, 6);
        LocalDate today = LocalDate.now();

        System.out.println("birth day=" + birthDay);
        System.out.println("today    =" + today);
        System.out.println(birthDay.until(today, ChronoUnit.DAYS) + " days");
    }
}
