package bk5_04DatesAndTimes;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimeTester {
	public static void main(String[] args) {
		System.out.println("\nLocalTime: " + LocalTime.now().toString());
		System.out.println("\nLocalDateTime: " + LocalDateTime.now().toString());
		System.out.println("\nZonedDateTime: " + ZonedDateTime.now().toString());
		System.out.println("\nOffsetTime: " + OffsetTime.now().toString());
		System.out.println("\nOffsetDateTime: " + OffsetDateTime.now().toString());
		System.out.println("\nMonthDay: " + MonthDay.now().toString());
		System.out.println("\nYearMonth: " + YearMonth.now().toString());
		System.out.println("\nInstant: " + Instant.now().toString());

		//Using the Month enumeration
		System.out.println("\nDecember have " + Month.FEBRUARY.length(true) + " days.");

		//Using the ZoneId class
		System.out.println("\n");
		for (String id : ZoneId.getAvailableZoneIds())
			System.out.println(id);
		
		
		System.out.println("\n");
		ZoneId z = ZoneId.of("Africa/Lusaka");
		ZonedDateTime zdate;
		zdate = ZonedDateTime.of(2022, 9, 23, 0, 0, 0, 0, z);
		System.out.println(zdate);
		
		zdate = ZonedDateTime.of(2022, 9, 23, 0, 0, 0, 0, ZoneId.of("Africa/Lusaka"));
		System.out.println(zdate);
		
		//Using the ZoneOffset class
		System.out.println("\n");
		OffsetTime time = OffsetTime.of(10, 52, 0, 0, ZoneOffset.ofHours(-8));
		System.out.println(time);
		
		//Looking Closer at the LocalDate Class
		System.out.println("\n");
		System.out.println(LocalDate.of(2022, 9, 23));
		System.out.println("\n");
		System.out.println(LocalDate.of(2022, Month.SEPTEMBER, 23));
		
		//Extracting Information About a Date
		System.out.println("\n");
		System.out.println(LocalDate.of(2022, Month.SEPTEMBER, 23).getYear());
		System.out.println();
		System.out.println(LocalDate.of(2022, Month.SEPTEMBER, 23).getDayOfWeek());
		System.out.println("\n");
		System.out.println(LocalDate.of(2022, Month.SEPTEMBER, 23).isAfter(LocalDate.now()));
		System.out.println();
		System.out.println(LocalDate.of(2022, Month.SEPTEMBER, 23).plusDays(10));
		
		//Comparing Dates
		if (LocalDate.now() == LocalDate.now())
			System.out.println("All is right in the universe.");
		else
			System.out.println("There must be a disturbance " +	"in the space-time continuum!");
		   /*
		    :: The above will never be equal because its testing objects against each other.
			:: To test the equality of two dates, you must use the isEqual method
		   */
		
		if (LocalDate.now().isEqual(LocalDate.now()))
			System.out.println("All is right in the universe.");
		
		//Calculating with Dates
		System.out.println("\n");
		System.out.println("Today: " + LocalDate.now());
		System.out.println("Tomorrow: " + LocalDate.now().plusDays(1));
		System.out.println("Next week: " + LocalDate.now().plusWeeks(1));
		System.out.println("Next month: " + LocalDate.now().plusMonths(1));
		System.out.println("Next year: " + LocalDate.now().plusYears(1));
		
		//To determine the difference between two dates
		System.out.println("\n");
		LocalDate date1 = LocalDate.parse("2014-05-16");
		LocalDate date2 = LocalDate.parse("2014-12-15");
		System.out.println(date1.until(date2, ChronoUnit.DAYS));
		
		//a business that prepares invoices on the 15th of each month.
		
		System.out.println("\n");
		LocalDate today = LocalDate.now();
		LocalDate invDate = LocalDate.of(today.getYear(), today.getMonthValue(), 15);
		if (today.getDayOfMonth() > 15) 
			invDate = invDate.plusMonths(1);
		long daysToInvoice = today.until(invDate, ChronoUnit.DAYS);
		System.out.println(daysToInvoice + " until next invoice date.");
		
		//Formatting Dates
		System.out.println("\n");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}