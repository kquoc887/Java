package demo.java.util.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Demo2 {
	public static void showCalendar(Calendar c) {
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int year = c.get(Calendar.YEAR);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(day + "-" + (month+1) + "-" + year + " " + hour + ":" + minute +":" + second);
	}
	public static void main(String[] args) {
		long milli = System.currentTimeMillis();
		milli -= TimeUnit.HOURS.toMillis(24);
		Date date = new Date(milli);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		showCalendar(calendar);
	}
//		Calendar --> Date
//		Calendar calendar = Calendar.getInstance();
//		Date date = calendar.getTime();
//		System.out.println(date);
				
//		Date-->Calendar
	
}
