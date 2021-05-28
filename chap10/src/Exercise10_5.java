import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_5 {
    static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date1 = null;
        Date date2 = null;

        try {
            date1 = sdf.parse(yyyymmdd1);
            date2 = sdf.parse(yyyymmdd2);
        } catch (Exception e) {
            return 0;
        }

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);

        return (int) ((cal1.getTimeInMillis() - cal2.getTimeInMillis()) / (24 * 60 * 60 * 1000));
    }

    public static void main(String[] args) {
        System.out.println(getDayDiff("20010103", "20010101"));
        System.out.println(getDayDiff("20010103", "20010103"));
        System.out.println(getDayDiff("20010103", "200103"));
    }
}
