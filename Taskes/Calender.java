
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Calender{
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("year"+
                           cal.get(Calendar.YEAR));
        System.out.println("month"+
                             cal.get(Calendar.MONTH) );
        System.out.println("Day"+
                           cal.get(Calendar.DATE) );
    cal.add(Calendar.DATE, 14);
       System.out.println("after 14 days"+cal.getTime());


    }
}