/*
package utils.timeutils;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil{
    public static String getCurrentTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy'-'hh:mm a");
        ZoneId istZoneId = ZoneId.of("Asia/Colombo");
        ZoneId courseZoneId = ZoneId.of("America/Los_Angeles");
        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime currentISTime = currentDateTime.atZone(istZoneId);
        ZonedDateTime currentETime = currentISTime.withZoneSameInstant(courseZoneId);
        return dateTimeFormatter.format(currentETime);
    }
    public static String getCurrentDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime currentDate = LocalDateTime.now();
        return dateTimeFormatter.format(currentDate);
    }
    
    public static String getEasternTime() {
        DateTimeFormatter etFormat = DateTimeFormatter.ofPattern("M/d/yyyy'-'h:m a");
        ZoneId istZoneId = ZoneId.of("Asia/Colombo");
        ZoneId etZoneId = ZoneId.of("America/New_York");
        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime currentISTime = currentDateTime.atZone(istZoneId);
        ZonedDateTime currentETime = currentISTime.withZoneSameInstant(etZoneId);
        return etFormat.format(currentETime);
    }
    
    public static String getFutureTime(Long minToDue) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("h:mm a");
        ZoneId istZoneId = ZoneId.of("Asia/Colombo");
        ZoneId courseZoneId = ZoneId.of("America/Los_Angeles");
        LocalDateTime currentDateTime = LocalDateTime.now().plusMinutes(minToDue);
        ZonedDateTime currentISTime = currentDateTime.atZone(istZoneId);
        ZonedDateTime currentETime = currentISTime.withZoneSameInstant(courseZoneId);
        return dateTimeFormatter.format(currentETime);
    }

    public static String getLosAngelesDateAndTimeToDue(Long daysToDue) {
        DateTimeFormatter etFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        ZoneId istZoneId = ZoneId.of("Asia/Colombo");
        ZoneId courseZoneId = ZoneId.of("America/Los_Angeles");
        LocalDateTime currentDateTime = LocalDateTime.now().plusDays(daysToDue);
        ZonedDateTime currentISTime = currentDateTime.atZone(istZoneId);
        ZonedDateTime currentETime = currentISTime.withZoneSameInstant(courseZoneId);
        return etFormat.format(currentETime);
    }

    public static String getLosAngelesDateAndTimeNow() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");
        ZoneId istZoneId = ZoneId.of("Asia/Colombo");
        ZoneId courseZoneId = ZoneId.of("America/Los_Angeles");
        LocalDateTime currentDateTime = LocalDateTime.now();
        ZonedDateTime currentISTime = currentDateTime.atZone(istZoneId);
        ZonedDateTime currentETime = currentISTime.withZoneSameInstant(courseZoneId);
        return dateTimeFormatter.format(currentETime);
    }
}
*/
