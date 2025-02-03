import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class AgeDateDemo {
    public static void main(String args[])
    {
        LocalDate startDate = LocalDate.of(2002, 8, 15);
        LocalDate endDate = LocalDate.of(2024, 1, 2);
        DayOfWeek dayOfWeek = endDate.getDayOfWeek();
        Period age = Period.between(startDate, endDate);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days" );
        System.out.println("Day of the week: " + dayOfWeek);
    }
}
