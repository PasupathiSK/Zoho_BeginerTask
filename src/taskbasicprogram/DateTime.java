package taskbasicprogram;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import check.UserDefinedException;
import check.CheckClass;

public class DateTime {
	LocalDateTime local=LocalDateTime.now();
// Get a ZonedDateTime 
	public ZonedDateTime getZonedDateTime(long tInt,String zoneId) {
	Instant	instant=Instant.ofEpochMilli(tInt);
	ZoneId	zId=ZoneId.of(zoneId);
		return instant.atZone(zId);
	}
// Get a ZineId	
	public ZoneId getZoneId(String zoneId) {
		return ZoneId.of(zoneId);
	}
// EX 1
public String currentDateTime(String sPattern)throws UserDefinedException {  // swami -resolved
	CheckClass.checkNull(sPattern);
	DateTimeFormatter format=DateTimeFormatter.ofPattern(sPattern);
	return local.format(format);
}
// EX 2
public long currentTimeInMillis() {
     // return Instant.now().toEpochMilli();    //     1665502948484
	    ZonedDateTime.now().toInstant().toEpochMilli();
	   return System.currentTimeMillis(); //swami  - resolved              1665502981022
}
// EX 3
public String currentTimeInParticularZone(String zoneId,String sPattern)throws UserDefinedException {// swami - resolved
	CheckClass.checkNull(zoneId);
	CheckClass.checkNull(sPattern);
	ZoneId zId=getZoneId(zoneId);
	DateTimeFormatter dTimeFormatter=DateTimeFormatter.ofPattern(sPattern);
	 return local.atZone(zId).format(dTimeFormatter);
}
// EX 4
public DayOfWeek currentDayOfWeek() {
	return DayOfWeek.from(local);
}
public DayOfWeek dayOfWeek(long tInput,String zoneId) throws UserDefinedException{ // swami - resolved
	CheckClass.checkNull(zoneId);
    return getZonedDateTime(tInput,zoneId).getDayOfWeek();
}
// EX 5
public Month currentMonth() {
	return Month.from(local);
}
public Month rMonth(long tInput,String zoneId) throws UserDefinedException{
	CheckClass.checkNull(zoneId);
   return getZonedDateTime(tInput,zoneId).getMonth();
}
// EX 6
public Year currentYear() {
	return Year.now();

}
public int getYear(long tInput,String zoneId)throws UserDefinedException {  // swami - resolved
	CheckClass.checkNull(zoneId);
	return getZonedDateTime(tInput,zoneId).getYear();
}
}
