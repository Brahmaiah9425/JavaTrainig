import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.Duration;

public class TimeZoneDifference {
    public static void main(String[] args) {
        ZoneId zone1 = ZoneId.of("Asia/Kolkata"); 
        ZoneId zone2 = ZoneId.of("America/New_York"); 
        ZonedDateTime timeInZone1 = ZonedDateTime.now(zone1);
        ZonedDateTime timeInZone2 = ZonedDateTime.now(zone2);
        System.out.println("Time in " + zone1 + ": " + timeInZone1);
        System.out.println("Time in " + zone2 + ": " + timeInZone2);
        Duration duration = Duration.between(timeInZone1, timeInZone2);
        long hours = duration.toHours();
        long minutes = (duration.toMinutes() % 60);
        System.out.println("Difference between the two time zones: " + hours + " hours and " + minutes + " minutes");
    }
}
