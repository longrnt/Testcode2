package DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TestDateTimeAdding {
	private final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
	};
	public static void main(String[] args) {
//		timeFetching = new Date(validTime);
		/* Adjust timezone */
		GregorianCalendar gre = new GregorianCalendar();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date localTime;
		try {
			localTime = format.parse("2015-01-28 10:30:00");
			gre.setTime(localTime);
			System.out.println(format.format(localTime));
			gre.add(Calendar.MONTH, 1);
			localTime = gre.getTime();
			System.out.println(format.format(localTime));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
