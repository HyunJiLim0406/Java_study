import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise10_8 {
    public static void main(String[] args) {
        ZonedDateTime seoul = ZonedDateTime.now();
        ZonedDateTime newYork = ZonedDateTime.now().withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println(seoul);
        System.out.println(newYork);

        long sec1 = seoul.getOffset().getTotalSeconds();
        long sec2 = newYork.getOffset().getTotalSeconds();
        long diff = (sec1 - sec2) / 3600;
        System.out.println("sec1="+sec1);
        System.out.println("sec2="+sec2);
        System.out.println("diff="+diff+" hrs");
    }
}
