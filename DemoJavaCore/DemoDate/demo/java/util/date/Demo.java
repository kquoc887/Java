package demo.java.util.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	public static void main(String[] args) throws ParseException {
		Date date1 = new Date();
		System.out.println("Ngày tháng năm chưa định dạng lại cách hiển thị:");
		System.out.println(date1);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String dateString = df.format(date1);
		System.out.println("\nSau khi đã dịnh dạng lại cách hiển thị:");
		System.out.println(dateString);
	}

}
