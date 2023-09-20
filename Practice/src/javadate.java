import java.time.*;
import java.time.format.DateTimeFormatter;

public class javadate {
	public static void main(String[] args) {
		// LocalDate date = new LocalDate();  // It is immutable
		
		LocalDate date=LocalDate.of(2022,10,28);
		System.out.println(date);
		
		LocalDate date1=LocalDate.now();
		System.out.println(date1);
		
		LocalDate date2=date1.plusDays(10);
		System.out.println(date2);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		System.out.println(LocalTime.MIDNIGHT);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.MIN);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		
		DateTimeFormatter datetimef=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		String format = date.format(datetimef);
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
		System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy EE")));
		
		DateTimeFormatter o = DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(time.format(o));
		
		String format1 = time.format(o);
		
		LocalTime parse = LocalTime.parse(format1,o);
		LocalDate date4 = LocalDate.parse(format,datetimef);
		
		System.out.println(parse);
		System.out.println(date4);
	}
}
