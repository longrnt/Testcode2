package oca;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		LocalDateTime d2 = LocalDateTime.of(2017, Month.JULY, 30,10, 28, 30);
		System.out.println(d2);
		
		d2 = d2.plusDays(2);
		System.out.println(d2);
		
		d2 = d2.plusWeeks(2);
		System.out.println(d2);
		
		System.out.println(d2.format(DateTimeFormatter.ISO_DATE_TIME));
	}
}
