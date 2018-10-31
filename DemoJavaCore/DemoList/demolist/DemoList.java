package demolist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class DemoList {
	public static void main(String[] args) {
		List<String> listString = new LinkedList<String>();
		listString.add("One");
		listString.add("Two");
		listString.add("Three");
		listString.add("Four");
		Scanner scanner = new Scanner(System.in);
		//Sử dụng vòng lập thông thường.
			System.out.println("Hiển thị các phần tử sử dụng vòng lập for thông thường:");
			for (int i = 0; i < listString.size(); i++) {
			System.out.println(listString.get(i));
		}
	}
}
