import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_2 {
    static int paycheckCount(Calendar from, Calendar to) {
        if (from == null || to == null)
            return 0;
        if (from.equals(to) && from.get(Calendar.DAY_OF_MONTH) == 21)
            return 1;

        int fromMon = from.get(Calendar.YEAR) * 12 + from.get(Calendar.MONTH);
        int toMon = to.get(Calendar.YEAR) * 12 + to.get(Calendar.MONTH);
        int monDiff = toMon - fromMon;

        if (monDiff < 0)
            return 0;
        if (from.get(Calendar.DAY_OF_MONTH) <= 21 && to.get(Calendar.DAY_OF_MONTH) >= 21)
            monDiff++;
        else if (from.get(Calendar.DAY_OF_MONTH) > 21 && to.get(Calendar.DAY_OF_MONTH) < 21)
            monDiff--;
        return monDiff;
    }

    static void printResult(Calendar from, Calendar to) {
        Date fromDate = from.getTime();
        Date toDate = to.getTime();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.print(sdf.format(fromDate) + " ~ " + sdf.format(toDate) + ":");
        System.out.println(paycheckCount(from, to));
    }

    public static void main(String[] args) {
        Calendar fromCal = Calendar.getInstance();
        Calendar toCal = Calendar.getInstance();

        fromCal.set(2010, Calendar.JANUARY, 1);
        toCal.set(2010, Calendar.JANUARY, 1);
        printResult(fromCal, toCal);

        fromCal.set(2010, Calendar.JANUARY, 21);
        toCal.set(2010, Calendar.JANUARY, 21);
        printResult(fromCal, toCal);

        fromCal.set(2010, Calendar.JANUARY, 1);
        toCal.set(2010, Calendar.MARCH, 1);
        printResult(fromCal, toCal);

        fromCal.set(2010, Calendar.JANUARY, 1);
        toCal.set(2010, Calendar.MARCH, 23);
        printResult(fromCal, toCal);

        fromCal.set(2010, Calendar.JANUARY, 23);
        toCal.set(2010, Calendar.MARCH, 21);
        printResult(fromCal, toCal);

        fromCal.set(2011, Calendar.JANUARY, 22);
        toCal.set(2010, Calendar.MARCH, 21);
        printResult(fromCal, toCal);
    }
}
