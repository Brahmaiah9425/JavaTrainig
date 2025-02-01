import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneDemo {
    public static void main(String[] args) {
        ZonedDateTime currentZone = ZonedDateTime.now();
        System.out.println("The current zone: " + currentZone.getZone());
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
        System.out.println("Tokyo Zone Date and Time: " + tokyoZone);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String tokyoFormat = tokyoZone.format(format);
        System.out.println("Formatted Tokyo Date and Time: " + tokyoFormat);
    }
}
