package dateandtimeapi;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class MethodPrefixes {

	public static void main(String[] args) {
		System.out.println(LocalDate.of(2015, Month.JANUARY, 1));
		System.out.println(Period.parse("P3M"));
		Duration d = Duration.ofSeconds(2);
		System.out.println(d.getSeconds());
		LocalTime lt1 = LocalTime.parse("11:30");
		LocalTime lt2 = LocalTime.NOON;
		System.out.println(lt1.isAfter(lt2));
		System.out.println(LocalDateTime.now().withYear(2001));
		Period period = Period.of(5, 2, 1);
		System.out.println(period.plusDays(1));
		System.out.println(period.minusDays(1));
		lt1 = LocalTime.MAX;
		System.out.println(lt1.toSecondOfDay());
		lt1 = LocalTime.MIDNIGHT;
		System.out.println(lt1.atDate(LocalDate.now()));
	}

}
