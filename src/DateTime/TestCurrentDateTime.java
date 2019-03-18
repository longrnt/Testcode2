package DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TestCurrentDateTime {
	public static void main(String[] args) {
//		testClearDate();
		testFormatClearDate();
	}
	
	public static void testFormatClearDate() {
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Date today = new Date();

		try {
			Date todayWithZeroTime = formatter.parse(formatter.format(today));
			System.out.println(todayWithZeroTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void testClearDate() {
		long millisInDay = 60 * 60 * 24 * 1000;
		Date currentDate = new Date();
		long currentTime = currentDate.getTime();
		long dateOnly = (currentTime / millisInDay) * millisInDay;
		Date clearDate = new Date(dateOnly);
		
		System.out.println("currentDate: " + currentDate);
		System.out.println("clearDate: " + clearDate);
	}
	
	public static void testCurrentDate() {
		long currentTime = System.currentTimeMillis();
		System.out.println(currentTime);
		System.out.println(new Date(currentTime));
	}
}
