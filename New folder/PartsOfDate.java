import java.time.DayOfWeek;
import java.time.LocalDate;
public class PartsOfDate {
    public static void main(String args[])
    {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.println("year : " +year + "Month : " +month + "Day : " +day);
        DayOfWeek dayName = today.getDayOfWeek();
        System.out.println("Today is name : "+dayName);
    }
}