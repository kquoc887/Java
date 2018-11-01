package demo.java.util.calendar;

import java.util.Calendar;

public class Demo1 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int year = calendar.get(Calendar.YEAR);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.println("Year:" + year);
		System.out.println("Month:" + month+1);
		System.out.println("Day:" + day);
		System.out.println("Hour:" + hour);
		System.out.println("Minute:" + minute);
		System.out.println("Second:" + second);
	}
}
