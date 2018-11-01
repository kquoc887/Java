package demo.java.util.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Demo {
	public static void main(String[] args) throws Exception {
//		Sử dụng properties để tạo ra một file properties
		Properties properties = new Properties();
		properties.setProperty("user", "admin");
		properties.setProperty("password", "admin1");
		properties.store(new FileWriter("info.properties"), null);
		
//		Sử dụng properties lấy giá trị của hệ thống
//		Properties properties = System.getProperties();
//		Set set = properties.entrySet();
//		Iterator iterator = set.iterator();
//		while (iterator.hasNext()) {
//			Map.Entry entry = (Entry) iterator.next();
//			System.out.println(entry.getKey() + " = " + entry.getValue());
//					
//		}
//		
//		Đọc file db.properties.
//		FileReader reader = new FileReader("db.properties");
//		Properties properties = new Properties();
//		properties.load(reader);
//		System.out.println(properties.getProperty("user"));
//		System.out.println(properties.getProperty("password"));

	}
}
