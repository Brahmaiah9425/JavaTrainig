import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

class DateDemo {
    public static void main(String[] args) 
    {
   
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = current.format(format);
        System.out.println("Formatted date and time: " + formattedDateTime);
        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();
        System.out.println("Month: " + month + " Day: " + day + " Seconds: " + seconds);
        LocalDate date2 = LocalDate.of(1947, 1, 15);
        System.out.println("Independence Day: " + date2);
    }
}
