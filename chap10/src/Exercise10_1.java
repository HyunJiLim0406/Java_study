import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2010, Calendar.JANUARY, 1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd은 F번째 E요일입니다.");

        for (int i = 0; i < 12; i++) {
            int weekday = cal.get(Calendar.DAY_OF_WEEK);
            int secondSunday = (weekday == 1) ? 8 : 16 - weekday;
            cal.set(Calendar.DAY_OF_MONTH, secondSunday);

            Date day = cal.getTime();
            System.out.println(sdf.format(day));

            cal.add(Calendar.MONTH, 1);
            cal.set(Calendar.DAY_OF_MONTH, 1);
        }
    }
}
